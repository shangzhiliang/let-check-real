package com.szl.letck.design.pattern.state.impl;

/**
 * 用户下单状态检查
 */
public class OrderCheckState extends RewardState{
    @Override
    void doReward(RewardStateContext context, Request request) {
        orderCheck(context, request);  //对进来的订单进行校验，判断是否用券，是否满足优惠条件等等
    }

    private void orderCheck(RewardStateContext context, Request request){
        System.out.println("订单状态检查！");
    }
}
