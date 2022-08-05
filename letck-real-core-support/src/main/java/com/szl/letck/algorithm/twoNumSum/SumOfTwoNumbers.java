package com.szl.letck.algorithm.twoNumSum;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

/**
 * @ClassName SumOfTwoNumbers
 * @Desc 给出一个整型数组 numbers 和一个目标值 target，请在数组中找出两个加起来等于目标值的数的下标，返回的下标按升序排列。
 * （注：返回的数组下标从1开始算起，保证target一定可以由数组里面2个数字相加得到）
 * 输入：[3,2,4],6
 * 返回值：[2,3]
 * 说明：因为 2+4=6 ，而 2的下标为2 ， 4的下标为3 ，又因为 下标2 < 下标3 ，所以返回[2,3]
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/1 18:24
 */
public class SumOfTwoNumbers {

    public static void main(String[] args) {
        int[] arr = {20,70,110,150};
        int target = 90;

        int[] indexArr = null;//twoNum(arr,target);

        indexArr = twoNumSum(arr,target);

        System.out.println(JSON.toJSONString(indexArr));
    }

    /**
     * 解法一:
     * @author szl
     * @date 2022/8/1 18:37
     * @param arr
     * @param target
     * @return int[]
     */
    public static int[] twoNum(int[] arr, int target){
        int[] indexArr = new int[2];

        for(int i = 0 ; i < arr.length -1 ;i ++){
            for (int j = i + 1; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    indexArr[0] = i + 1;
                    indexArr[1] = j + 1;
                    return new int[]{i+1,j+1};
                }
            }
        }

        return indexArr;
    }

    public static int[] twoNumSum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ;i < arr.length ;i ++){
            int temp = target - arr[i];

            if(!map.containsKey(temp)){
                map.put(arr[i],i);
            } else {
                return new int[]{map.get(temp) + 1,i + 1};
            }
        }

        return null;
    }
}
