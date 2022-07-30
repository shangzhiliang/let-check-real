package com.szl.letck.design.pattern.strategy.impl;

/**
 * 抽象奖励策略
 */
public abstract class RewardStrategy {
    //抽象奖励方法，具体奖励策略实现具体的奖励值
    public abstract double reward(long userId);

    // 保存奖励策略，结算商户账户
    public void insertRewardAndSettlement(long userId,double reward){
        insertReward(userId,reward);

        settlement(userId);
    }

    // 保存奖励，结算账户
    private void insertReward(Long userId, double rewardMoney){
        System.out.println("保存奖励成功！用户：" +userId+" ,奖励金额 rewardMoney:"+rewardMoney);
    }

    //升级用户等级
    private void settlement(Long userId){
        System.out.println("用户" +userId+" 等级升级成功！");
    }
}
