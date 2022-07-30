package com.szl.letck.design.pattern.proxy.impl;

/**
 * @ClassName WuAiWuJiaProxy
 * @Description:// 我爱我家提供中介服务，添加可代理的开发商服务
 * @Auther Administrator
 * @Date 2021/2/19 18:11
 * @Version 1.0
 */
public class WuAiWuJiaProxy implements HouseOwner{

    private HouseOwner bjBiGuiYuan;

    /**
     * @Author szl
     * @Description // 购买房产前验资，介绍房产服务
     * @Date 2021/2/19 18:16
     * @Param []
     * @return void
     **/
    private void beforeSellingHouse(){
        System.out.println("我爱我家给您提供服务!");
        bjBiGuiYuan = new BJBiGuiYuan();
    }

    @Override
    public void sellingHouse() {
        beforeSellingHouse();
        bjBiGuiYuan.sellingHouse();
        afterSellingHouse();
    }

    /**
     * @Author szl
     * @Description  卖房后提供售后服务
     * @Date 2021/2/19 18:25
     * @Param []
     * @return void
     **/
    private void afterSellingHouse(){
        System.out.println("您买房，我爱我家提供售后服务！");
    }
}
