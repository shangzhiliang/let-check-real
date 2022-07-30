package com.szl.letck.design.pattern.strategy;

/**
 * 封装策略容器
 *  //封装策略，屏蔽高层模块对策略、算法的直接访问，屏蔽可能存在的策略变化
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy regestStrategy(int type){
        Strategy strategy = null;
        switch (type){
            case 1 :
                this.strategy = new StrategyA();
                break;
            case 2 :
                this.strategy = new StrategyB();
                break;
            default: this.strategy = new StrategyA();
        }

        return strategy;
    }

    public void doStrategy() {
        strategy.strategyImplementation();
    }
}
