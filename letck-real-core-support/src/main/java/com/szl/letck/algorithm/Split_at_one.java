package com.szl.letck.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.*;
/**
 * @ClassName Split_at_one
 * @Desc
 * 一群孩子做游戏，现在请你根据游戏得分来发糖果，要求如下：
 * 1. 每个孩子不管得分多少，起码分到一个糖果。
 * 2. 任意两个相邻的孩子之间，得分较多的孩子必须拿多一些糖果。(若相同则无此限制)
 * 给定一个数组 arr 代表得分数组，请返回最少需要多少糖果。
 * 要求: 时间复杂度为 O(n)空间复杂度为 O(n)
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/27 10:54
 */
public class Split_at_one {

    public static void main(String[] args) {
        int[] arr = {50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,
                20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};

        System.out.println(JSON.toJSONString(arr));

        int result = candy(arr);

        System.out.println(result);
    }

        /**
         * pick candy
         * @param arr int整型一维数组 the array
         * @return int整型
         */
        public static int candy (int[] arr) {
            // write code here

            int[] arrGet = new int[arr.length];
            int sum = 0;
            for(int i = 0 ; i < arr.length; i++) {
                arrGet[i] = 1;
            }

            //单调递增的，先增加1
            for(int i = 1 ; i < arr.length; i++) {
                if(  arr[i] > arr[i-1] ){
                    arrGet[i] = arrGet[i-1] + 1;
                }
            }


            sum += arrGet[arr.length - 1];
            // 反向处理
            for(int i = arr.length -2 ;i >= 0 ;i-- ){

                if(arr[i] > arr[i+1] && arrGet[i] <= arrGet[i+1]){
                    arrGet[i] = arrGet[i+1] + 1;
                }

                sum += arrGet[i];
            }

            System.out.println(JSON.toJSONString(arrGet));

            return sum;
        }

}
