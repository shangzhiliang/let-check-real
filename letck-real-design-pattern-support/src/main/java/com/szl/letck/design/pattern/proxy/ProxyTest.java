package com.szl.letck.design.pattern.proxy;

/**
 * @ClassName ProxyTest
 * @Description:代理模式验证
 * @Auther Administrator
 * @Date 2021/2/19 18:03
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.preRequest();
        proxy.request();
        proxy.postRequest();
    }
}
