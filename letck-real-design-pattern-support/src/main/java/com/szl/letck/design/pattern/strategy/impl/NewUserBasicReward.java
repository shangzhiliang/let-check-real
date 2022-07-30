package com.szl.letck.design.pattern.strategy.impl;

public class NewUserBasicReward extends RewardStrategy{

    @Override
    public double reward(long userId) {
        System.out.println("新用户 基础奖励规则 实现");
        return 5.0d;
    }
}
