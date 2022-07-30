package com.szl.letck.design.pattern.proxy;

/**
 * @ClassName Proxy
 * @Description: //代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问或控制或扩展真实主题的功能。
 * @Auther Administrator
 * @Date 2021/2/19 17:54
 * @Version 1.0
 */
public class Proxy implements Subject{

    private Subject realSubject;

    /**
     * @Author szl
     * @Description //预处理请求
     * @Date 17:56 2021/2/19
     * @Param []
     * @return void
     **/
    public void preRequest(){
        System.out.println("预处理请求！");
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        // 代理层调用真实处理请求
        this.realSubject.request();
    }

    /**
     * @Author szl
     * @Description // 请求处理完成，后续处理
     * @Date 18:00 2021/2/19
     * @Param []
     * @return void
     **/
    public void postRequest(){
        System.out.println("postRequest over.");
    }
}
