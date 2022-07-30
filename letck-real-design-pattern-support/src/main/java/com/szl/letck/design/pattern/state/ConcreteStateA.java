package com.szl.letck.design.pattern.state;

//定义状态A
public class ConcreteStateA extends State{

    @Override
    public void handle1() { //本状态必须要处理的事情
        System.out.println("处理状态：handle1 逻辑完成！");
    }

    @Override
    public void handle2() {// 本状态必须要处理的事情
        super.context.setCurrentState(Context.contreteStateB);  //切换到状态B
        super.context.handle2();  //执行状态B的任务
    }
}
