package com.szl.letck.distribute.support.binding;

import com.szl.letck.distribute.support.enums.ExchangeType;

/**
 * @ClassName Destination
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 11:39
 * @Version v1.0
 */
public interface Destination {
    ExchangeType exchangeType();

    String queueName();

    String exchangeName();

    String routingKey();
}
