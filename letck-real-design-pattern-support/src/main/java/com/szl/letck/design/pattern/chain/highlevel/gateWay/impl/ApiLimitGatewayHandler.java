package com.szl.letck.design.pattern.chain.highlevel.gateWay.impl;

import com.szl.letck.design.pattern.chain.highlevel.gateWay.GatewayHandler;

/**
 * @ClassName ApiLimitGatewayHandler
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 10:11
 */
public class ApiLimitGatewayHandler extends GatewayHandler {

    @Override
    public void handle(Object source) {
        System.out.println("api 接口限流，处理中....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("api 接口限流处理完成");

        //仍给下一个执行
        super.handleMessage(source);

    }
}
