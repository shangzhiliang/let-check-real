package com.szl.letck.design.pattern.strategy.impl;

/**
 * 老用户奖励规则A
 */
public class OldUserRewardStrategyA extends RewardStrategy{

    @Override
    public double reward(long userId) {
        // 实现老用户奖励规则A的逻辑
        System.out.println("老用户奖励规则A实现");
        return 0.0d;
    }

}
