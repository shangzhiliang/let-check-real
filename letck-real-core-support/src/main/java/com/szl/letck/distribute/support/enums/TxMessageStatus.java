package com.szl.letck.distribute.support.enums;

import java.util.HashMap;
import java.util.Map;

public enum TxMessageStatus {
    /**
     * 成功
     */
    SUCCESS(1),
    /**
     * 待处理
     */
    PENDING(0),
    /**
     * 处理失败
     */
    FAIL(-1);

    private final Integer status;

    private TxMessageStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

}
