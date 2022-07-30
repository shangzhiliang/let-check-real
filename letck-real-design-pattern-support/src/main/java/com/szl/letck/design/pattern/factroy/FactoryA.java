package com.szl.letck.design.pattern.factroy;

import org.apache.poi.ss.formula.functions.T;

public class FactoryA extends Factory<T>{
    @Override
    Product createProduct(Class<T> c) throws Exception {
        return (Product) Class.forName(c.getName()).newInstance();
    }

    public static void main(String[] args) throws Exception {
        Factory factoryA = new FactoryA();
        // 创建一个生产者A
        Product product = factoryA.createProduct(ProductA.class);

        // 创建一个生产者B
        Product productB = factoryA.createProduct(ProductB.class);

        product.method();
        productB.method();
    }
}
