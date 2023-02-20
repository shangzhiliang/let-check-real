package com.szl.letck.algorithm.绝对值最小;

/**
 * @ClassName FindminNum
 * @Desc
 * 有一个已经排好序的整数序列(升序 ， 无重复项) ，序列中可能有正整数、负整数或者 0，请用你认为 最
 * 优的方法求序列中绝对值最小的数。
 * 可以用任何语言实现。
 * 输入：一个有序的整数序列。
 * 输出：绝对值最小的数
 * @Author szl
 * @Version 1.0
 * @Date 2023/2/7 10:31
 */
public class FindminNum {

    public static int findAbsMin(int[] arr){
        int absMin = Integer.MIN_VALUE;

        if(arr.length == 0){
            return  absMin;
        }

        if(arr[0] >=0 ){
            return arr[0];
        }

        if(arr[arr.length -1] <=0){
            return arr[arr.length-1];
        }

        int mid = 0;
        int begin = 0;
        int end = arr.length-1;
        //找到正负数分界点
        while(true) {
            mid = begin + (end - begin) / 2;
            if (arr[mid] == 0) {
                return 0;
            } else if (arr[mid] > 0) {
                if (arr[mid - 1] > 0) {
                    end = mid - 1;
                } else if (arr[mid - 1] == 0) {
                    return 0;
                } else {
                    //找到正负数的分界线
                    break;
                }
            } else {
                if (arr[mid + 1] < 0) {
                    begin = mid + 1;
                } else if (arr[mid + 1] == 0) {
                    return 0;
                } else {
                    //找到正负数的分界线
                    break;
                }
            }
        }

        if(arr[mid] > 0) {
            if(arr[mid] < Math.abs(arr[mid-1])) {
                absMin = arr[mid];
            }else {
                absMin = arr[mid-1];
            }
        } else {
            if(arr[mid] < Math.abs(arr[mid+1])) {
                absMin = arr[mid];
            }else {
                absMin = arr[mid+1];
            }
        }

        return absMin;
    }


    public static void main(String[] args) {
        int[] arr = {-4,-3,-1,1,4,5,8};
        int absMin = findAbsMin(arr);
        System.out.println(absMin);
    }
}
