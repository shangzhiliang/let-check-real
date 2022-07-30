package com.szl.letck.distribute.support.enums;

import java.util.HashMap;
import java.util.Map;


public enum ExchangeType {
    FANOUT("fanout"),

    DIRECT("direct"),

    TOPIC("topic"),

    DEFAULT("");
;


    private String type;

    private ExchangeType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
