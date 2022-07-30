package com.szl.letck.design.pattern.template.simple;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.poi.ss.formula.functions.T;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Administrator
 * @projectName BankBusinessHandler.java
 * @Description 模板方法模式，java8 新实现方式，减少模板方法实现类创建，提高代码可维护性<br/>
 *
 * @Date 2022/2/14 10:44
 * @Version 1.0
 */
public class BankBusinessHandler {

    /**
     * @Author szl
     * @Description
     * @Date 2022/2/14 10:44
     * @Param
     * @return
     */
    private Consumer<BigDecimal> saveOperation(BigDecimal amount) {
        return a -> System.out.println("存钱 " + amount);
    }

    private Consumer<BigDecimal> draw(BigDecimal amount){
        return a -> System.out.println("取钱 " + amount);
    }

    public void saveVip(String type,BigDecimal amount){
        Supplier<String> supplier = () -> type + " number:" + RandomUtils.nextInt();
        executeV2(supplier,saveOperation(amount));
    }

    public void drawVip(String type,BigDecimal amount){
        Supplier<String> supplier = () -> type + " number:" + RandomUtils.nextInt();
        executeV2(supplier,draw(amount));
    }

    /**
     * @Author szl
     * @Description  本执行器提供
     * @Date 2022/2/14 14:26
     * @Param
     * @return
     */
    private void executeV2(Supplier<String> supplier, Consumer<BigDecimal> consumer) {

        String number = supplier.get();

        System.out.println(number);

        if(number.startsWith("vip")){
            //Vip号分配到VIP柜台
            System.out.println("Assign To Vip Counter");
        } else if (number.startsWith("reservation")) {

            //预约号分配到专属客户经理

            System.out.println("Assign To Exclusive Customer Manager");

        } else {

            //默认分配到普通柜台

            System.out.println("Assign To Usual Manager");

        }

        consumer.accept(null);

        judge();

    }
    
    private void getNumber() {

        System.out.println("number-00" + RandomUtils.nextInt());

    }

    private void judge() {

        System.out.println("give a praised");

    }

    public static void main(String[] args) {
        BankBusinessHandler bankBusinessHandler = new BankBusinessHandler();
//        bankBusinessHandler.save(BigDecimal.valueOf(150));

        bankBusinessHandler.saveVip("reservation",BigDecimal.valueOf(15000));
        System.out.println("--------------------");
        bankBusinessHandler.drawVip("vip",BigDecimal.valueOf(1000));
    }


}
