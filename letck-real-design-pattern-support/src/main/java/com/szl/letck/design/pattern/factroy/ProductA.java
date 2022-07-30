package com.szl.letck.design.pattern.factroy;

/**
 * 创建一个具体的产品A
 */
public class ProductA extends Product{
    @Override
    public void method() { //具体的执行逻辑
        System.out.println("  create productA");
    }
}
