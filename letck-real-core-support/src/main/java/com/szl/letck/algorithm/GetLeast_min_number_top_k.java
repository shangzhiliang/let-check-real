package com.szl.letck.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @ClassName GetLeast_min_number_top_k
 * @Desc
 * 给定一个长度为 n 的可能有重复值的数组，找出其中不去重的最小的 k 个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4(任意顺序皆可)。
 * 数据范围：0 <= k,n <= 100000 数组中每个数的大小 0 <= val <= 10000
 * 要求：空间复杂度 O(n) ，时间复杂度 O(nlogn)
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/25 18:39
 */
public class GetLeast_min_number_top_k {


    public static void main(String[] args) {
        int n = 10;
        int[] arr = createNumArr(n);

        System.out.println(JSON.toJSONString(arr));

        int k = 4;
        List<Integer> result = getLeast_min_list_num(arr,k);

        System.out.println(result);
    }

    /**
     * 方案1
     * @author szl
     * @date 2022/7/25 19:19
     * @param arr
     * @param k
     * @return List<Integer>
     */
    private static List<Integer> getLeast_min_list_num(int[] arr, int k){
        ArrayList<Integer> listArr = new ArrayList<>();

        Arrays.sort(arr);
        for(int i = 0 ; i < k;i ++){
            listArr.add(arr[i]);
        }

        return listArr;
    }
    /**
     * 方案 2
     * @author szl
     * @date 2022/7/25 19:19
     * @param arr
     * @param k
     * @return List<Integer>
     */
    private static List<Integer> getLeast_min_list_num2(int[] arr, int k){
        List<Integer> listArr = new ArrayList<>();
        for(int i = 0 ; i < arr.length;i ++){
            listArr.add(arr[i]);
        }

        listArr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        return listArr.subList(0,k);
    }

    private static int[] createNumArr(int n){
        Random random = new Random();
        int[] arr = new int[n];
        int i = 0 ;
        while( i < n){
            arr[i] = random.nextInt(20);
            i++;
        }

        return arr;
    }
}
