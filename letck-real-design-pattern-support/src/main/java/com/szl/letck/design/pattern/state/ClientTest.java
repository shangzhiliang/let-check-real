package com.szl.letck.design.pattern.state;

/**
 * @Author szl
 * @Description  状态模式验证
 * @Date 2022/2/11 16:13
 * @Param
 * @return
 **/
public class ClientTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteStateA());
        context.handle1();
        context.handle2();
    }
}
