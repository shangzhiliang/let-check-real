package com.szl.letck.distribute;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.szl.letck.distribute.service.TransactionalMessageService;
import com.szl.letck.distribute.support.binding.DefaultDestination;
import com.szl.letck.distribute.support.enums.ExchangeType;
import com.szl.letck.distribute.support.message.DefaultTxMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName MockBusinessService
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 15:48
 * @Version v1.0
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class MockBusinessService {

    private final JdbcTemplate jdbcTemplate;
    private final TransactionalMessageService transactionalMessageService;
    private final ObjectMapper objectMapper;

    @Transactional(rollbackFor = Exception.class)
    public void saveOrder() throws Exception {
        String orderId = UUID.randomUUID().toString();
        BigDecimal amount = BigDecimal.valueOf(100L);
        Map<String, Object> message = new HashMap<>();
        message.put("orderId", orderId);
        message.put("amount", amount);
        jdbcTemplate.update("INSERT INTO t_order(order_id,amount) VALUES (?,?)", p -> {
            p.setString(1, orderId);
            p.setBigDecimal(2, amount);
        });
        String content = objectMapper.writeValueAsString(message);
        transactionalMessageService.sendTransactionalMessage(
                DefaultDestination.builder()
                        .exchangeName("tm.test.exchange")
                        .queueName("tm.test.queue")
                        .routingKey("tm.test.key")
                        .exchangeType(ExchangeType.DIRECT)
                        .build(),
                DefaultTxMessage.builder()
                        .businessKey(orderId)
                        .businessModule("SAVE_ORDER")
                        .content(content)
                        .build()
        );
        log.info("保存订单:{}成功...", orderId);
    }
}