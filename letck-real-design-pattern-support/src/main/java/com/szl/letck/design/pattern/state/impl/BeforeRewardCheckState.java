package com.szl.letck.design.pattern.state.impl;

/**
 * 奖励前状态检查
 */
public class BeforeRewardCheckState extends RewardState{
    @Override
    void doReward(RewardStateContext context, Request request) {
        beforeRewardCheckState(context,request);
    }

    private void beforeRewardCheckState(RewardStateContext context, Request request) {
        System.out.println("奖励前状态检查！");

        context.setResultFlag(false);
    }

}
