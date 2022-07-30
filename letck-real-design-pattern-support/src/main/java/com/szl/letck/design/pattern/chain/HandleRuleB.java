package com.szl.letck.design.pattern.chain;

public class HandleRuleB extends Handler{
    public HandleRuleB(int level) {
        super(level);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("我是处理者2,我正在处理B规则");

        request.setRequestLevel(3);
        handleMessage(request);
    }
}
