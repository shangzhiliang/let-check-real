package com.szl.letck.algorithm;

/**
 * @ClassName FenbEeitongTest
 * @Desc 裴波那契数列打印
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/1 14:45
 */
public class FibonaqiTest {

    public static void main(String[] args) {
        int n = 6;
        int res = Fibonaqi(n);

        System.out.println("\n\n方法二输出斐波那契数列：");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(diGui(i) + "    ");
        }

    }

    /**
     * 方法一：使用循环赋值的方式，从第3个数开始，前两个数的和等于第三个数
     * @author szl
     * @date 2022/8/1 17:48
     * @param n
     * @return int
     */
    private static int Fibonaqi(int n){

        if(n <= 1){
            return n;
        }

        int res = 0;
        int a = 0;
        int b = 1;

        for(int i = 2 ;i < n + 1 ;i ++){
            res = (a+b);
            a = b;
            b = res;
            System.out.print(res + ",");
        }

        return res;
    }

    /**
     * 使用递归的方式，从2开始，结果返回 idGui（n-2） + diGui(n-1)
     *  要打印需要外层再 从0 开始遍历。
     * @author szl
     * @date 2022/8/1 17:49
     * @param n
     * @return int
     */
    private static int diGui(int n ){
        if(n <= 1 ){
            return  n;
        } else {
            return diGui(n-2) + diGui(n-1);
        }

    }

}
