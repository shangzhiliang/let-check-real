package com.szl.letck.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @ClassName JDTest
 * @Desc 题目：一个数组 array 和一个数 k ，从数组中移除 k 个元素，找出移除后数组中剩余不同数的最少数量
 * 输入：arr = [5,7,1,1,7,7,6], k = 2
 * 输出：2
 * 输入：arr = [5,7,1,1,7,7,6,6], k = 2
 * 输出：3
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/21 17:11
 */
public class JDTest {

    private static int findMinNumbers(int[] arr, int k) {
        Map<Integer, Integer> new_arr = new LinkedHashMap<>(6);
        //统计
        for (int i = 0; i < arr.length; i++) {
            int count = new_arr.getOrDefault(arr[i], 0) + 1;
            new_arr.put(arr[i], count);
        }
        ArrayList<Map.Entry<Integer, Integer>> sortArra = new ArrayList<>(new_arr.entrySet());
        Collections.sort(sortArra, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        int result = sortArra.size();
        for (int i = 0; i < sortArra.size() && k > 0; i++) {
            if (sortArra.get(i).getValue() <= k) {
                result--;
                k -= sortArra.get(i).getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {5, 7, 1, 1, 7, 7, 6};
        int[] arr = {5,7,1,1,7,7,6,6};
        int k = 3;
        int result = findMinNumbers(arr, k);
        System.out.println(JSON.toJSONString(arr));
        System.out.println(result);
    }
}
