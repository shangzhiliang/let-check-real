package com.szl.letck.design.pattern.state;

//定义状态A
public class ConcreteStateB extends State{

    @Override
    public void handle1() { //本状态必须要处理的事情
        super.context.setCurrentState(Context.contreteStateA);  //切换到状态B
        super.context.handle1();  //执行状态1的任务
    }

    @Override
    public void handle2() {// 本状态必须要处理的事情
        System.out.println("处理状态：handle2 逻辑完成！");
    }
}
