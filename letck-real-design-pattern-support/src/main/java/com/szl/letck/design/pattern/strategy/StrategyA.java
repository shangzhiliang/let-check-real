package com.szl.letck.design.pattern.strategy;

/**
 * 定义具体策略A
 */
public class StrategyA implements Strategy {
    @Override
    public void strategyImplementation() {
        System.out.println("StrateayA is working...");
    }
}
