package com.szl.letck.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * @ClassName Find_list_theK_max_num
 * @Desc
 * 有一个整数数组，请你根据快速排序的思路，找出数组中第 k 大的数。
 *
 * 给定一个整数数组 a ,同时给定它的大小n和要找的 k ，请返回第 k 大的数(包括重复的元素，不用去重)，保证答案存在。
 * 要求：时间复杂度 O(nlogn)，空间复杂度 O(1)
 * 数据范围： 0≤n≤10 5次方
 * 1≤K≤n，数组中每个元素满足 0≤val≤10 的9次方
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/25 19:27
 */
public class Find_list_theK_max_num {


    public static void main(String[] args) {
        int n = 5;
        int k = 3;

        Integer[] arr = createArr(n);

        System.out.println(JSON.toJSONString(arr));

        int res = getTheKMaxNum(arr,n,k);

        System.out.println(res);
    }

    private static int getTheKMaxNum(Integer[] arr,int n ,int k){

        if(n < k){
            k = n;
        }

        Arrays.sort(arr,new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(JSON.toJSONString(arr));

        return arr[k-1];
    }

    private static Integer[] createArr(int n ){
        Integer[] arr = new Integer[n];
        Random random = new Random();
        int i = 0 ;
        while (i < n){
            arr[i] = random.nextInt(20);
            i++;
        }

        return arr;

    }
}
