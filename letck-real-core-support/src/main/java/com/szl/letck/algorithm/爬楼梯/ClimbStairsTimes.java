package com.szl.letck.algorithm.爬楼梯;

/**
 * @ClassName ClimbStairsTimes
 * 裴波那契数列变种算法
 * @Desc 猴子跳台阶问题：
 * https://blog.csdn.net/NaturalNumber/article/details/113139718
 * @Author szl
 * @Version 1.0
 * @Date 2023/2/7 11:17
 */
public class ClimbStairsTimes {

    public static int climbStairs(int n) {
        if(n== 1 || n == 2){
            return 1;
        }

        if(n == 3){
            return  2;
        }

        int sum = 0;

        if(n > 3){
            sum = climbStairs(n-1) + climbStairs(n - 3);
        }

        return sum;
    }

    public static void main(String[] args) {
        int i = climbStairs(5);
        System.out.println(i);
    }
// 1 个台阶: {1} = 1种方式
// 2 个台阶:{1,1} = 1种方式
// 3 个台阶:{1,1,1} + {3} = 2种方式
// 4 个台阶:{1,1,1,1} + {1,3} + {3,1} = 3种方式
// 5 个台阶:{1,1,1,1,1} + {1,1,3} + {1,3,1} + {3,1,1} = 4 种方式
// 6 个台阶:{1,1,1,1,1,1} + {1,1,1,3} + {1,1,3,1} + {1,3,1,1} +{3,1,1,1} + {3,3} = 6种方式
// 7 个台阶:{1,1,1,1,1,1,1} + {1,1,1,1,3} + {1,1,1,3,1} + {1,1,3,1,1} + {1,3,1,1,1} + {3,1,1,1,1} + {1,3,3} +{3,1,3} +{3,3,1}  = 9种
    // 符合罗汉塔 数据模型 f(n) = f(n-2) + f(n-3)
}
