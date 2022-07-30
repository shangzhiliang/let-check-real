package com.szl.letck.design.pattern.state.impl;

//领奖状态
public abstract class RewardState {
    //定义抽象领奖处理过程方法
    abstract void doReward(RewardStateContext context, Request request);
}
