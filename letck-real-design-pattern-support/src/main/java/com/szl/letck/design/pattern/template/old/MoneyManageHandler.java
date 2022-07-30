package com.szl.letck.design.pattern.template.old;

/**
 * @ClassName SaveMoneyHandler
 * @Description:存钱业务实现，继承抽象业务处理模板
 * @Auther Administrator
 * @Date 2022/2/11 17:50
 * @Version 1.0
 */
public class MoneyManageHandler extends AbstractBusinessHandler{
    @Override
    public void handle() {
        System.out.println("理财业务");
    }
}
