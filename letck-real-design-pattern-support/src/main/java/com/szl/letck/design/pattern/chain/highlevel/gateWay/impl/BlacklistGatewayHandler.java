package com.szl.letck.design.pattern.chain.highlevel.gateWay.impl;

import com.szl.letck.design.pattern.chain.highlevel.gateWay.GatewayHandler;

/**
 * @ClassName BlacklistGatewayHandler
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 10:11
 */
public class BlacklistGatewayHandler extends GatewayHandler {

    @Override
    public void handle(Object source) {
        System.out.println("黑名单拦截，处理中....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("黑名单拦截，处理完成");
        //仍给下一个执行
        super.handleMessage(source);
    }
}
