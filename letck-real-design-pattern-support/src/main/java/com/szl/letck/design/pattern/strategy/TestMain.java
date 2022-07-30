package com.szl.letck.design.pattern.strategy;

/**
 * @Author szl
 * @Description  策略模式验证
 * @Date 2022/2/11 16:13 
 * @Param
 * @return
 **/
public class TestMain {
    public static void main(String[] args) {
        Strategy strategy = new StrategyA();
        //装载策略
        Context context = new Context(strategy);

        strategy = context.regestStrategy(2);//注册类型1的 策略，

        //执行策略
        context.doStrategy();
    }
}
