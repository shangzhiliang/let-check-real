package com.szl.letck.design.pattern.template.old;

/**
 * @ClassName TestMain
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/2/11 17:52
 * @Version 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        SaveMoneyHandler saveMoneyHandler = new SaveMoneyHandler();
        saveMoneyHandler.execute();

        DrawMoneyHandler drawMoneyHandler = new DrawMoneyHandler();
        drawMoneyHandler.execute();

        MoneyManageHandler moneyManageHandler = new MoneyManageHandler();
        moneyManageHandler.execute();
    }
}
