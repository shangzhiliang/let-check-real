package com.szl.letck.design.pattern.builder.template;

/**
 * @ClassName Product
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/2/14 16:43
 * @Version 1.0
 */
public class Product {
    private String partA;

    private String partB;

    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show(){
        // 显示产品属性
    }
}
