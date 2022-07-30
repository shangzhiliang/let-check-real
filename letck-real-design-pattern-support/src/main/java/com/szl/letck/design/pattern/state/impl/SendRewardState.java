package com.szl.letck.design.pattern.state.impl;

public class SendRewardState extends RewardState{
    @Override
    void doReward(RewardStateContext context, Request request) {
        sendRewardState(context,request);
    }

    private void sendRewardState(RewardStateContext context, Request request) {
        System.out.println("奖励成功状态");
    }


}
