package com.szl.letck.design.pattern.proxy.impl;

/**
 * @ClassName LinkHomeProxy
 * @Description:TODO
 * @Auther Administrator
 * @Date 2021/2/19 18:30
 * @Version 1.0
 */
public class LinkHomeProxy implements HouseOwner{
    private BJBiGuiYuan bjBiGuiYuan = new BJBiGuiYuan();

    /**
     * @Author szl
     * @Description  购房前提供介绍房子服务，链家中介
     * @Date 2021/2/19 18:32
     * @Param []
     * @return void
     **/
    private void beforeSellingHouse(){
        System.out.println("链家为您提供购房服务！");
    }

    @Override
    public void sellingHouse() {
        beforeSellingHouse();
        this.bjBiGuiYuan.sellingHouse();
        afterSellingHouse();
    }

    private void afterSellingHouse(){
        System.out.println("购房后由链家为您提供售后服务！");
    }
}
