package com.szl.letck.design.pattern.chain;

/**
 * @Author szl
 * @Description  责任链模式验证
 * @Date 2022/2/11 16:14 
 * @Param
 * @return
 **/
public class Client {
    public static void main(String[] args) {
        HandleRuleA handleRuleA = new HandleRuleA(1);
        HandleRuleB handleRuleB = new HandleRuleB(2);

        handleRuleA.setNextHandler(handleRuleB);
        handleRuleA.handleRequest(new Request());
    }
}
