package com.szl.letck.distribute.support.message;

import com.szl.letck.distribute.support.message.TxMessage;
import lombok.Builder;

/**
 * @ClassName DefaultTxMessage
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 11:53
 * @Version v1.0
 */
@Builder
public class DefaultTxMessage implements TxMessage {
    private String businessModule;
    private String businessKey;
    private String content;
    @Override
    public String businessModule() {
        return businessModule;
    }
    @Override
    public String businessKey() {
        return businessKey;
    }
    @Override
    public String content() {
        return content;
    }
}
