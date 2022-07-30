package com.szl.letck.distribute.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.szl.letck.distribute.entity.TransactionalMessage;

/**
 * @ClassName TransactionalMessageDao
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 11:20
 * @Version v1.0
 */
public interface TransactionalMessageDao {

    void insertSelective(TransactionalMessage record);

    void updateStatusSelective(TransactionalMessage record);

    List<TransactionalMessage> queryPendingCompensationRecords(LocalDateTime minScheduleTime,
                                                               LocalDateTime maxScheduleTime,
                                                               int limit);
}
