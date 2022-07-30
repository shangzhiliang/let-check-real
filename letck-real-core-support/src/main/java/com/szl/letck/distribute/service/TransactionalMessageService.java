package com.szl.letck.distribute.service;

import com.szl.letck.distribute.support.binding.Destination;
import com.szl.letck.distribute.support.message.TxMessage;

/**
 * @ClassName TransactionalMessageService
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 11:38
 * @Version v1.0
 */
public interface TransactionalMessageService {
    void sendTransactionalMessage(Destination destination, TxMessage message);
}
