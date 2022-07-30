package com.szl.letck.design.pattern.chain;

public class HandleRuleA extends Handler{

    public HandleRuleA(int level) {
        super(level);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("我是处理者1,我正在处理A规则");

        //升级level并传递请求
        request.setRequestLevel(2);
        handleMessage(request);
    }


}
