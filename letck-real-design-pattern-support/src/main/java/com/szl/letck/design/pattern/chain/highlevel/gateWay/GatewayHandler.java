package com.szl.letck.design.pattern.chain.highlevel.gateWay;

/**
 * @ClassName GatewayHandler
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 10:09
 */
public abstract class GatewayHandler {

    private GatewayHandler nextGatewayHandler;

    public void setNextHandler(GatewayHandler nextGatewayHandler){
        this.nextGatewayHandler = nextGatewayHandler;
    }

    public GatewayHandler getNextGatewayHandler() {
        return nextGatewayHandler;
    }

    protected void handleMessage(Object source){
        if(nextGatewayHandler != null){
            nextGatewayHandler.handle(source);
        }
    }

    public abstract void handle(Object source);
}
