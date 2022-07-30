package com.szl.letck.design.pattern.state.impl;

/**
 * 奖励失败状态处理
 */
public class RewardFailedState extends RewardState{
    @Override
    void doReward(RewardStateContext context, Request request) {
        rewardFailedState(context,request);
    }

    private void rewardFailedState(RewardStateContext context, Request request) {
        System.out.println("奖励失败状态！");
    }
}
