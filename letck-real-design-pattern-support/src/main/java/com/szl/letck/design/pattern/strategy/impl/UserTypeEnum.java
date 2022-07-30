package com.szl.letck.design.pattern.strategy.impl;

public enum UserTypeEnum {
    NEW_USER(1),
    OLD_USER(2);

    private Integer value;

    private UserTypeEnum(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
