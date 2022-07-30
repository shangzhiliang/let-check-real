package com.szl.letck.algorithm;

import java.util.*;

/**
 * 正整数数组，实现一个方法，将数组中的数分组并输出，分组规则如下：
 * 1~10、11~100、101~1000、1001~10000 ……  10000001~100000000 ……
 * 输出的数据结构，需要自己定义；
 * 例：
 * public static Map<String, List> grouping(long[] arr);
 */
public class LongArrayGroupTest {

    public static void main(String[] args) {

        long[] arr = {3,4,7,8,10,11,12,100,101,102,234,1000,1094,10503};
        Map<String, List>  result =  grouping(arr);

        System.out.println(result);
    }

    private static void findClassLoader() {
        ClassLoader classLoader = LongArrayGroupTest.class.getClassLoader();
        while (classLoader != null){
            System.out.println(classLoader.toString());
            classLoader = classLoader.getParent();
        }
    }

    public static Map<String, List> grouping(long[] arr){
        Map<String, List> listMap = new LinkedHashMap<>();

        for(long itemLong : arr){
           String key = caculateNumberLength(itemLong);
            if(!listMap.containsKey(key)){
                List<Long> _to10 = new LinkedList<>();
                _to10.add(itemLong);
                listMap.put(key,_to10);
            } else {
                listMap.get(key).add(itemLong);
            }
        }

        return listMap;
    }

    /**
     * 计算数字归属组的key
     * 数字按位数分组 比如，1~10 一组，表示个位的数，10 是特殊个位数。单独计算
     * @param number
     * @return
     */
    private static String caculateNumberLength(long number){
        String strNumber = number + "";
        String key = "";

        if(number <= 10){
            key = "1~10";
            return key;
        }

        String endKey = "";
        String startKey = "1";
        if(number % 10 ==0){
            endKey = number +"";
            startKey = ((number / 10) +1)+"";
        } else {
            endKey ="1";
            for (int j =0 ;j < strNumber.length() ; j++){
                endKey += "0";
            }

            for(int i = 0  ; i < strNumber.length() - 2 ;i ++){
                startKey += "0";
            }
            startKey += 1;
        }

        return startKey+"~"+endKey;
    }
}
