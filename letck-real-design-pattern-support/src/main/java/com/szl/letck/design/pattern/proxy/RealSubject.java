package com.szl.letck.design.pattern.proxy;

/**
 * @ClassName RealSubject
 * @Description:// 真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 * @Auther Administrator
 * @Date 2021/2/19 17:53
 * @Version 1.0
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("处理真实请求,realSubject");
    }
}
