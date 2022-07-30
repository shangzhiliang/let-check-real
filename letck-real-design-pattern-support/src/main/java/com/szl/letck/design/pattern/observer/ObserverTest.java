package com.szl.letck.design.pattern.observer;

/**
 * @ClassName ObserverTest
 * @Description:观察者模式验证
 * @Auther Administrator
 * @Date 2021/2/20 10:18
 * @Version 1.0
 */
public class ObserverTest {
    public static void main(String[] args) {

        ObserverSubject observerSubject = new ConCreteObserverSubject();
        observerSubject.add(new ConcreteObserver1());
        observerSubject.add(new ConcreteObserver2());

        observerSubject.notifyObservers();

        observerSubject.remove(observerSubject.observerList.get(0));

    }
}
