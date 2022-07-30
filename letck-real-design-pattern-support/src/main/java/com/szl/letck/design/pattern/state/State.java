package com.szl.letck.design.pattern.state;

/**
 * 状态抽象接口
 */
public abstract class State {
    //状态转换容器
    Context context;
    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void handle1();//状态1处理逻辑
    public abstract void handle2();//状态2处理逻辑
}
