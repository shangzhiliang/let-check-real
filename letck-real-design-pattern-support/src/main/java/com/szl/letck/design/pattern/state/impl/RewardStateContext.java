package com.szl.letck.design.pattern.state.impl;

/**
 * 定义领奖状态转换容器
 */
public class RewardStateContext {

    private RewardState rewardState;

    private boolean isResultFlag ;

    public void setRewardState(RewardState currentState) {
        this.rewardState = currentState;
    }

    public RewardState getRewardState() {
        return rewardState;
    }

    public void echo(RewardStateContext context, Request request) {
        rewardState.doReward(context, request);
    }

    public boolean isResultFlag(){
        return isResultFlag;
    }

    public void setResultFlag(boolean isResultFlag){
        this.isResultFlag = isResultFlag;
    }
}
