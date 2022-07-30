package com.szl.letck.design.pattern.proxy.impl;

/**
 * @ClassName BJHouseProxy
 * @Description:TODO
 * @Auther Administrator
 * @Date 2021/2/19 18:28
 * @Version 1.0
 */
public class BJHouseProxy {
    public static void main(String[] args) {
        WuAiWuJiaProxy wuAiWuJiaProxy = new WuAiWuJiaProxy();
        wuAiWuJiaProxy.sellingHouse();

        System.out.println();

        LinkHomeProxy homeProxy = new LinkHomeProxy();
        homeProxy.sellingHouse();
    }
}
