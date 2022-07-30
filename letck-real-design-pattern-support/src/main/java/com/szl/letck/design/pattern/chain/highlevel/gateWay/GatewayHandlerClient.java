package com.szl.letck.design.pattern.chain.highlevel.gateWay;

import com.szl.letck.design.pattern.chain.highlevel.gateWay.factory.GatewayHandlerEnumFactory;
import lombok.SneakyThrows;

/**
 * @ClassName GatewayHandlerClient
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/28 10:10
 */
public class GatewayHandlerClient {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("main- 开始处理...");
        GatewayHandler firstHandler = GatewayHandlerEnumFactory.getFirstGatewayHandler();
        firstHandler.handle(null);
        System.out.println("main- 结束处理...");
    }
}
