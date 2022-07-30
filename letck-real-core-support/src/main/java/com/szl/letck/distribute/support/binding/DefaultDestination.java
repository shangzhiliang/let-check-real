package com.szl.letck.distribute.support.binding;

import com.szl.letck.distribute.support.enums.ExchangeType;
import lombok.Builder;

/**
 * @ClassName DefaultDestination
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 11:51
 * @Version v1.0
 */
@Builder
public class DefaultDestination implements Destination {
    private ExchangeType exchangeType;
    private String queueName;
    private String exchangeName;
    private String routingKey;

    @Override
    public ExchangeType exchangeType() {
        return exchangeType;
    }
    @Override
    public String queueName() {
        return queueName;
    }
    @Override
    public String exchangeName() {
        return exchangeName;
    }
    @Override
    public String routingKey() {
        return routingKey;
    }
}
