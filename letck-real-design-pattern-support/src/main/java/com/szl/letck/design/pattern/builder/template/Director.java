package com.szl.letck.design.pattern.builder.template;

/**
 * @ClassName Director
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/2/14 17:46
 * @Version 1.0
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
