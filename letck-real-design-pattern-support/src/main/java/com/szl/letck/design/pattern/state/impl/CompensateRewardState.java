package com.szl.letck.design.pattern.state.impl;

/**
 * 待补偿领奖状态
 */
public class CompensateRewardState extends RewardState{
    @Override
    void doReward(RewardStateContext context, Request request) {
        compensateReward(context, request);  //返奖失败，需要对用户进行返奖补偿
    }

    private void compensateReward(RewardStateContext context, Request request) {
        System.out.println("待补偿状态逻辑处理完成！");
    }
}
