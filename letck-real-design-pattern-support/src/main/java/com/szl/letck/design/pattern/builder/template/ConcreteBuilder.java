package com.szl.letck.design.pattern.builder.template;

/**
 * @ClassName ConcreteBuilder
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/2/14 17:45
 * @Version 1.0
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
