package com.szl.letck.design.pattern.strategy.impl;

/**
 * 新用户奖励规则B
 */
public class NewUserRewardStrategyB extends RewardStrategy{

    @Override
    public double reward(long userId) {
        // 实现新用户奖励规则B的逻辑
        System.out.println("新用户奖励规则B实现");
        return 0.0d;
    }

}
