package com.szl.letck.design.pattern.observer;

/**
 * @ClassName ConcreteObserver2
 * @Description: //具体观察者2 ,当被通知到时触发执行自己负责的业务逻辑
 * @Auther Administrator
 * @Date 2021/2/20 10:15
 * @Version 1.0
 */
public class ConcreteObserver2 implements IObserver{
    @Override
    public void response() {
        System.out.println("第二观察者授命执行任务！");
    }
}
