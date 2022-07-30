package com.szl.letck.distribute.dao;

import com.szl.letck.distribute.entity.TransactionalMessageContent;

import java.util.List;

/**
 * @ClassName TransactionalMessageContentDao
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 11:37
 * @Version v1.0
 */
public interface TransactionalMessageContentDao {

    void insert(TransactionalMessageContent record);

    List<TransactionalMessageContent> queryByMessageIds(String messageIds);
}
