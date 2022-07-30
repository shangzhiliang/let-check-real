package com.szl.letck.design.pattern.strategy.impl;


import org.apache.poi.ss.formula.functions.T;

/**
 * 具体的策略生产工厂，执行后创建一个具体的奖励策略
 */
public class ConcreteStrategyFactory extends StrategyFactory{
    @Override
    RewardStrategy createStrategy(Class c) {
        RewardStrategy product = null;
        try {
            product = (RewardStrategy) Class.forName(c.getName()).newInstance();
        } catch (Exception e){
            //创建策略失败
        }

        return product;
    }
}
