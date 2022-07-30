package com.szl.letck.design.pattern.observer;

/**
 * @ClassName ConcreteObserver1
 * @Description: //具体观察者1 ,当被通知到时触发执行自己负责的业务逻辑
 * @Auther Administrator
 * @Date 2021/2/20 10:15
 * @Version 1.0
 */
public class ConcreteObserver1 implements IObserver{
    @Override
    public void response() {
        System.out.println("第一观察者授命执行任务！");
    }
}
