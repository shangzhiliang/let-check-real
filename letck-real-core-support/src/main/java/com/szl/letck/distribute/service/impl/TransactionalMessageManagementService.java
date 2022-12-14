package com.szl.letck.distribute.service.impl;

import com.szl.letck.distribute.entity.TransactionalMessage;
import com.szl.letck.distribute.entity.TransactionalMessageContent;
import com.szl.letck.distribute.dao.TransactionalMessageContentDao;
import com.szl.letck.distribute.dao.TransactionalMessageDao;
import com.szl.letck.distribute.support.enums.TxMessageStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @ClassName TransactionalMessageManagementService
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 12:02
 * @Version v1.0
 */
@Slf4j
@Service
public class TransactionalMessageManagementService {

    private  TransactionalMessageDao messageDao;
    private  TransactionalMessageContentDao contentDao;
    private  RabbitTemplate rabbitTemplate;

    private static final LocalDateTime END = LocalDateTime.of(2999, 1, 1, 0, 0, 0);
    private static final long DEFAULT_INIT_BACKOFF = 10L;
    private static final int DEFAULT_BACKOFF_FACTOR = 2;
    private static final int DEFAULT_MAX_RETRY_TIMES = 5;
    private static final int LIMIT = 100;

    public TransactionalMessageManagementService() {
    }

    public void saveTransactionalMessageRecord(TransactionalMessage record, String content) {
        record.setMessageStatus(TxMessageStatus.PENDING.getStatus());
        record.setNextScheduleTime(calculateNextScheduleTime(LocalDateTime.now(), DEFAULT_INIT_BACKOFF,
                DEFAULT_BACKOFF_FACTOR, 0));
        record.setCurrentRetryTimes(0);
        record.setInitBackoff(DEFAULT_INIT_BACKOFF);
        record.setBackoffFactor(DEFAULT_BACKOFF_FACTOR);
        record.setMaxRetryTimes(DEFAULT_MAX_RETRY_TIMES);
        messageDao.insertSelective(record);
        TransactionalMessageContent messageContent = new TransactionalMessageContent();
        messageContent.setContent(content);
        messageContent.setMessageId(record.getId());
        contentDao.insert(messageContent);
    }

    public void sendMessageSync(TransactionalMessage record, String content) {
        try {
            rabbitTemplate.convertAndSend(record.getExchangeName(), record.getRoutingKey(), content);
            if (log.isDebugEnabled()) {
                log.debug("??????????????????,????????????:{},????????????:{}", record.getQueueName(), content);
            }
            // ????????????
            markSuccess(record);
        } catch (Exception e) {
            // ????????????
            markFail(record, e);
        }
    }

    private void markSuccess(TransactionalMessage record) {
        // ???????????????????????????????????????
        record.setNextScheduleTime(END);
        record.setCurrentRetryTimes(record.getCurrentRetryTimes().compareTo(record.getMaxRetryTimes()) >= 0 ?
                record.getMaxRetryTimes() : record.getCurrentRetryTimes() + 1);
        record.setMessageStatus(TxMessageStatus.SUCCESS.getStatus());
        record.setEditTime(LocalDateTime.now());
        messageDao.updateStatusSelective(record);
    }

    private void markFail(TransactionalMessage record, Exception e) {
        log.error("??????????????????,????????????:{}", record.getQueueName(), e);
        record.setCurrentRetryTimes(record.getCurrentRetryTimes().compareTo(record.getMaxRetryTimes()) >= 0 ?
                record.getMaxRetryTimes() : record.getCurrentRetryTimes() + 1);
        // ??????????????????????????????
        LocalDateTime nextScheduleTime = calculateNextScheduleTime(
                record.getNextScheduleTime(),
                record.getInitBackoff(),
                record.getBackoffFactor(),
                record.getCurrentRetryTimes()
        );
        record.setNextScheduleTime(nextScheduleTime);
        record.setMessageStatus(TxMessageStatus.FAIL.getStatus());
        record.setEditTime(LocalDateTime.now());
        messageDao.updateStatusSelective(record);
    }

    /**
     * ???????????????????????????
     *
     * @param base          ????????????
     * @param initBackoff   ???????????????
     * @param backoffFactor ????????????
     * @param round         ??????
     * @return LocalDateTime
     */
    private LocalDateTime calculateNextScheduleTime(LocalDateTime base,
                                                    long initBackoff,
                                                    long backoffFactor,
                                                    long round) {
        double delta = initBackoff * Math.pow(backoffFactor, round);
        return base.plusSeconds((long) delta);
    }

    /**
     * ???????????? - ?????????????????????????????????????????????
     */
    public void processPendingCompensationRecords() {
        // ???????????????????????????????????????????????????????????????????????????????????????????????????
        LocalDateTime max = LocalDateTime.now().plusSeconds(-DEFAULT_INIT_BACKOFF);
        // ??????????????????????????????1??????
        LocalDateTime min = max.plusHours(-1);
        Map<Long, TransactionalMessage> collect =  messageDao.queryPendingCompensationRecords(min, max, LIMIT)
                .stream()
                .collect(Collectors.toMap(TransactionalMessage::getId, x -> x));

        if (!collect.isEmpty()) {
            StringJoiner joiner = new StringJoiner(",", "(", ")");
            collect.keySet().forEach(x -> joiner.add(x.toString()));
            contentDao.queryByMessageIds(joiner.toString())
                    .forEach(item -> {
                        TransactionalMessage message = collect.get(item.getMessageId());
                        sendMessageSync(message, item.getContent());
                    });
        }
    }
}
