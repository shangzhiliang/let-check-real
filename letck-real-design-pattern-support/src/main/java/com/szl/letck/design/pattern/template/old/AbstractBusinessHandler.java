package com.szl.letck.design.pattern.template.old;

import org.apache.commons.lang.math.RandomUtils;

import java.util.Random;

/**
 * @ClassName AbstractBusinessHandler
 * @Description: 模板方法模式定义
 * @Auther Administrator
 * @Date 2022/2/11 16:20
 * @Version 1.0
 */
public abstract class AbstractBusinessHandler {

    /**
     * @Author szl
     * @Description  模板方法模式的执行方法入口
     * 一直以来，开发者们在使用模板方法的时候基本都是像上面这个例子一样：需要准备一个抽象类，
     * 将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来让子类实现剩余的逻辑。
     * 不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。
     * 但是，有了Java 8以后，模板方法有了另外一种实现方式，不需要定义特别多的实现类了。
     * @Date 2022/2/11 16:21
     * @Param []
     * @return void
     **/
    public final void execute(){
        getNumber();

        handle();

        judge();
    }

    /**
     * @Author szl
     * @Description  排号
     * @Date 2022/2/11 16:23
     * @Param []
     * @return void
     **/
    private void getNumber(){
        System.out.println("number -00 " + RandomUtils.nextInt());
    }

    /**
     * @Author szl
     * @Description  处理业务，抽象模板方法，由具体业务类实现
     * @Date 2022/2/11 16:23
     * @Param []
     * @return void
     **/
    public abstract void handle();

    /**
     * @Author szl
     * @Description  业务办理完成后评价
     * @Date 2022/2/11 16:24 
     * @Param []
     * @return void
     **/
    private void judge(){
        System.out.println("give a praised .");
    }
}
