package com.szl.letck.design.pattern.strategy.impl;

/**
 * 返奖主流程设计
 */
public class InviteRewardImpl {
    //返奖主流程
    public void sendReward(long userId) {
        ConcreteStrategyFactory strategyFactory = new ConcreteStrategyFactory();  //创建工厂
        Invitee invitee = getInviteeByUserId(userId);  //根据用户id查询用户信息
        if (invitee.getUserType() == UserTypeEnum.NEW_USER.getValue()) {  //新用户返奖策略
            NewUserBasicReward newUserBasicReward = (NewUserBasicReward) strategyFactory.createStrategy(NewUserBasicReward.class);
            RewardContext rewardContext = new RewardContext(newUserBasicReward);
            rewardContext.doStrategy(userId); //执行返奖策略
        }

        if(invitee.getUserType() == UserTypeEnum.OLD_USER.getValue()){ //老用户返奖策略，...
            OldUserRewardStrategyA oldUserRewardStrategyA = (OldUserRewardStrategyA) strategyFactory.createStrategy(OldUserRewardStrategyA.class);
            RewardContext rewardContext = new RewardContext(oldUserRewardStrategyA);
            rewardContext.doStrategy(userId); //执行返奖策略
        }
    }

    private Invitee getInviteeByUserId(long userId){
        Invitee invitee = new Invitee();
        if(userId == 1l){
            invitee.setUserType(1);
        } else {
            invitee.setUserType(2);
        }
        return invitee;
    }

    public static void main(String[] args) {
        InviteRewardImpl inviteReward = new InviteRewardImpl();

        inviteReward.sendReward(1L);

        System.out.println("========================================");

        inviteReward.sendReward(2L);


    }
}
