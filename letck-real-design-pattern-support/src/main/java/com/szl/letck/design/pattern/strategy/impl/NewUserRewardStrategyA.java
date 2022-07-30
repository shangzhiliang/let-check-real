package com.szl.letck.design.pattern.strategy.impl;

/**
 * 新用户奖励规则A
 */
public class NewUserRewardStrategyA extends RewardStrategy{

    @Override
    public double reward(long userId) {
        // 实现新用户奖励规则A的逻辑
        System.out.println("新用户奖励规则A实现");
        return 0.0d;
    }

}
