package com.szl.letck.design.pattern.builder.template;

/**
 * @ClassName Builder
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/2/14 17:44
 * @Version 1.0
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }

}
