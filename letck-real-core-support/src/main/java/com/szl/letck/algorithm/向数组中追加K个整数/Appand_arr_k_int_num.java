package com.szl.letck.algorithm.向数组中追加K个整数;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @ClassName Appand_arr_k_int_num
 * @Desc 给你一个整数数组 nums和一个整数 k 。
 * 请你向 nums 中追加 k个未出现在 nums 中的、
 * 互不相同的正整数，并使结果数组的元素和 最小 。返回追加到 nums 中的 k 个整数之和。
 * 提示：
 * 1 <= nums.length <= 10的 5次方
 * 1 <= nums[i], k <= 10的 9 次方
 *
 * 示例 1：
 * 输入：nums = [1,4,25,10,25], k = 2  输出：5
 * 解释：在该解法中，向数组中追加的两个互不相同且未出现的正整数是 2 和 3 。
 * nums 最终元素和为 1 + 4 + 25 + 10 + 25 + 2 + 3 = 70 ，这是所有情况中的最小值。
 * 所以追加到数组中的两个整数之和是 2 + 3 = 5 ，所以返回 5
 *
 * 分析： 首先数组可能不是自增的有序数组，需要对数据做升序处理，可以使用Arrays.sort(int[]);
 * 其次，提示中给了k的区间值，新增的数字与原数组内元素相加最小，那k一定是1，顺序往上增加，每次只增加1。
 * 那数组和一定是最小的，要注意的是增增加k 个值里可能已存在数组中了，遇到这个值要后措一个值，所以增加k的目标也要增加1；
 * 要不然就用个计数器，统计增加够k个，结束添加。
 *
 * @Author szl
 * @Version 1.0
 * @Date 2023/2/10 19:45
 */
public class Appand_arr_k_int_num {

    public static void main(String[] args) {
        int[] arr = {4,2,6};
        int k = 3;
        int addNumsMin = getAddNumsMin(arr, k);
        System.out.println(addNumsMin);
    }

    public static int getAddNumsMin(int[] arr, int k){
        int sum = 0;
        Arrays.sort(arr);
        List<Integer> integerList = new ArrayList<>();
        Arrays.stream(arr).forEach(d->
                integerList.add(d)
        );

        int temp = 1;
        // 方法一
//        while (temp <= k ){
//            if(!integerList.contains(temp)){
//                integerList.add(temp);
//                sum = sum + temp;
//            } else {
//                k++;
//            }
//
//            temp++;
//        }

        // 方法二
        int count = k;
        while (count > 0){
            if(!integerList.contains(temp)){
                integerList.add(temp);
                sum = sum + temp;
                count--;
            }

            temp++;
        }

        System.out.println(JSON.toJSONString(integerList));
        return sum;
    }

}
