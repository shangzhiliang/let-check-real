package com.szl.letck.algorithm;

/**
 * @ClassName APIsqrt
 * @Desc 求一个数的开平方，无限接近，保留两位小数
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/4 18:28
 */
public class APIsqrt {

    static double erfenSqrt(double x , double jingDu){

        if(x < 0){
            System.out.println("负数排除开平方");
            return -1d;
        }

        if(x == 0){
            return 0;
        }
        //  1e-6 设置精度是1 乘以 10 的 -6 次方，即 0.000001
        final double _jingDu = jingDu;

        double _high = x;
        double _low = 0;
        // 中间值
        double _mid = Double.MAX_VALUE;
        // 赋值最后一个中间值
        double last_mid = Double.MIN_VALUE;

        // 循环的条件是 中间值 - 最后一个中间值
        while (Math.abs(_mid - last_mid) > _jingDu){
            last_mid = _mid;
            _mid = (_low + _high) / 2;
            if(_mid * _mid > x){
                _high = _mid;
            }

            if(_mid * _mid < x){
                _low = _mid;
            }
        }

        return _mid;
    }

    public static void main(String[] args){
        double x = 3;
        double _jingDu = 1e-6;
        double root = erfenSqrt(x,_jingDu);
        System.out.println(root);
    }


}
