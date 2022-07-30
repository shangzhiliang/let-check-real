package com.szl.letck.design.pattern.observer;

/**
 * @ClassName ConCreteObserverSubject
 * @Description: 具体的观察者目标，
 * @Auther Administrator
 * @Date 2021/2/19 19:22
 * @Version 1.0
 */
public class ConCreteObserverSubject extends ObserverSubject{

    @Override
    protected void notifyObservers() {
        // 判断具体目标状态变化，根据情况通知观察者做更新处理

        // 等待条件满足通知观察者
        for (IObserver iObserver : observerList ){
            iObserver.response();
        }
    }
}
