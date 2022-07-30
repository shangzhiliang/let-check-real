package com.szl.letck.design.pattern.state.impl;

public class RewardSuccessState extends RewardState{
    @Override
    void doReward(RewardStateContext context, Request request) {
        rewardSuccessState(context,request);
    }

    private void rewardSuccessState(RewardStateContext context, Request request) {
        System.out.println("领奖成功，");
    }
}
