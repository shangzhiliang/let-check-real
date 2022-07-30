package com.szl.letck.design.pattern.strategy.impl;

/**
 * 策略执行
 */
public class RewardContext {
    private RewardStrategy strategy;
    public RewardContext(RewardStrategy strategy){
        this.strategy = strategy;
    }

    public void doStrategy(long userId){
        double rewardMoney = strategy.reward(userId);

        strategy.insertRewardAndSettlement(userId,rewardMoney);

    }
}
