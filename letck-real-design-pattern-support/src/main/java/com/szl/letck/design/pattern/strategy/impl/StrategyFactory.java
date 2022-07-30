package com.szl.letck.design.pattern.strategy.impl;

/**
 * 抽象策略生产工厂
 * @param <T>
 */
public abstract class StrategyFactory<T> {
     abstract RewardStrategy createStrategy(Class<T> c);
}
