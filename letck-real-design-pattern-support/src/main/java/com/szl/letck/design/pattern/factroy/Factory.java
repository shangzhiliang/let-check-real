package com.szl.letck.design.pattern.factroy;

/**
 * 抽象工厂类
 * @param <T>
 */
public abstract class Factory<T> {
    // 创造一个抽象产品对象
    abstract Product createProduct(Class<T> c) throws Exception;
}
