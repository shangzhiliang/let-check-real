package com.szl.letck.algorithm;

/**
 * 二分查找实现
 */
public class FindIntNumerTest {

    public static void main(String[] args) {
        float[] arr = {1.0f, 3, 5, 7, 8, 9, 10};
        //int post = commomSearch(arr,4, 10)
        //System.out.println(" 位置在 ：" + post);


        printNumSumSeq(15);

    }

    /**
     * 算法实现
     *
     * @param arr
     * @param target
     * @return
     */
    private static int commomSearch(float[] arr, int n, int target) {

        int low = 0;
        int hight = n;
        int middle = 0;

        if (target < arr[low] || target > arr[hight] || low > hight) {
            return -1;
        }

        while (low <= hight) {
            middle = (low + hight) / 2;

            if (arr[middle] > target) {
                hight = middle - 1;

            } else if (arr[middle] < target) {
                low = middle + 1;
            } else {
                return middle;
            }

        }

        return middle;
    }

    /**
     * 8. 输入一个正数n，输出所有和为n连续正数序列，例如输入15，输出为{1,2,3,4,5} 、{4,5,6}、{7,8}。（可用java或伪代码或思路）
     * @param n
     */
    private static void printNumSumSeq(int n) {

        int start = 1;
        int end = 2;
        int sum = start + end;

        while (start < n) {

            if (sum == n) {
                for (int i = start; i < end; i++) {
                    System.out.print(i + ",");
                }

                System.out.println(end);
                end++;
                sum += end;
            } else if (sum < n) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }

        }
    }


}
