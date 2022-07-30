package com.szl.letck.design.pattern.proxy.impl;

/**
 * @ClassName BJBiGuiYuan
 * @Description:// 定位北京碧桂园提供居住服务真实主题
 * @Auther Administrator
 * @Date 2021/2/19 18:09
 * @Version 1.0
 */
public class BJBiGuiYuan implements HouseOwner{
    @Override
    public void sellingHouse() {
        System.out.println("欢迎订购碧桂园房产!");
    }
}
