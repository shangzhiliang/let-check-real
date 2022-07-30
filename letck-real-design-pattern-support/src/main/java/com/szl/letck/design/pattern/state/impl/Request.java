package com.szl.letck.design.pattern.state.impl;

public class Request {
    Long userId;
    Long orderId;
    public Request(Long userId,Long orderId){
        this.userId = userId;
        this.orderId =orderId;
    }
}
