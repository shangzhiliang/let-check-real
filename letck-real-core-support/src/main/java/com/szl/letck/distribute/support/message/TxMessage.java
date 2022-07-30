package com.szl.letck.distribute.support.message;

/**
 * @ClassName TxMessage
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 11:52
 * @Version v1.0
 */
public interface TxMessage {
    String businessModule();
    String businessKey();
    String content();
}
