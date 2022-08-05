package com.szl.letck.algorithm.tanXin;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @ClassName MinNumOfHostTest
 * @Desc
 * 有 n 个活动即将举办，每个活动都有开始时间与活动的结束时间，第 i 个活动的开始时间是 starti ,
 * 第 i 个活动的结束时间是 endi ,举办某个活动就需要为该活动准备一个活动主持人。
 *
 * 一位活动主持人在同一时间只能参与一个活动。并且活动主持人需要全程参与活动，换句话说，一个主持人参与了第 i 个活动，
 * 那么该主持人在 (starti,endi) 这个时间段不能参与其他任何活动。求为了成功举办这 n 个活动，最少需要多少名主持人。
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/1 19:14
 */
public class MinNumOfHostTest {

    public static void main(String[] args) {
        int[][] startEnd = new int[2][2];
        startEnd[0] = new int[]{1,3};
        startEnd[1] = new int[]{2,4};
        int n = 2;
        int res = minnumberOfHost(2,startEnd);
        System.out.println(JSON.toJSONString(startEnd));
        System.out.println(res);
    }

    private static  int minnumberOfHost(int n ,int[][] startEnd){

        int res = 0;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0 ;i < n ;i ++){
            start[i] = startEnd[i][0];
            end[i] = startEnd[i][1];
        }

        Arrays.sort(start,0,start.length);
        Arrays.sort(end,0,end.length);

        int j = 0;
        for(int i = 0 ;i < n;i++){
            if(start[i] >= end[j]){
                j++;
            } else {
                res ++;
            }
        }

        return res;
    }
}
