package com.szl.letck.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObserverSubject
 * @Description: // 定义抽象的观察者管理方案，添加观察者，删除观察者，通知观察者执行逻辑等方法；
 * @Auther Administrator
 * @Date 2021/2/19 19:19
 * @Version 1.0
 */
public abstract class ObserverSubject {

    protected List<IObserver> observerList = new ArrayList<>();

    // 公共方法，添加一个观察者
    protected void add(IObserver iObserver){
        observerList.add(iObserver);
        System.out.println("注册一个观察者");
    }

    // 公共方法：删除一个观察者
    protected void remove(IObserver iObserver){
        observerList.remove(iObserver);
        System.out.println("删除一个观察者");
    }

    // 抽象方法，由具体执行者实现逻辑，通知观察者执行任务
    protected abstract void notifyObservers();
}
