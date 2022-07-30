package com.szl.letck.design.pattern.strategy;

/**
 * 定义具体策略A
 */
public class StrategyB implements Strategy {
    @Override
    public void strategyImplementation() {
        System.out.println("StrategyB is working...");
    }
}
