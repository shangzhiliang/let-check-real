package com.szl.letck.algorithm.string;

import com.alibaba.fastjson.JSON;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName Compare2version_isSame
 * @Desc 对比两个version号。
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/3 21:42
 */
public class Compare2version_isSame {

    public static int compareVersion(String v1 ,String v2){
        String[] arr_v1 = v1.split("\\.");
        String[] arr_v2 = v2.split("\\.");

        int i =0 ,j =0 ;

        while (i < arr_v1.length || j < arr_v2.length){
            int x = i < arr_v1.length ? Integer.parseInt(arr_v1[i]) : 0;
            int y = j < arr_v2.length ? Integer.parseInt(arr_v2[i]) : 0;

            if(x > y){
                return 1;
            }

            if(x < y){
                return -1;
            }

            i ++ ;
            j ++;
        }

        return 0;
    }

    private static int compareVersionWithMap(String v1 ,String v2 ){
        String[] arr_v1 = v1.split("\\.");
        String[] arr_v2 = v2.split("\\.");
        int size = arr_v1.length > arr_v2.length ? arr_v1.length : arr_v2.length;
        Map<String,Integer> v1_map = new HashMap<>();
        Map<String,Integer> v2_map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if(i < arr_v1.length){
                v1_map.put(i+"",Integer.parseInt(arr_v1[i]));
            }

            if(i < arr_v2.length){
                v2_map.put(i+"",Integer.parseInt(arr_v2[i]));
            }
        }

        for (int i = 0; i < size; i++) {
             String key = i +"";
            if(v1_map.get(key) != null && v2_map.get(key) != null){
               if(v1_map.get(key).intValue() > v2_map.get(key).intValue()) {
                   return 1;
               }

                if(v1_map.get(key).intValue() < v2_map.get(key).intValue()) {
                    return -1;
                }
            } else if (v1_map.get(key) == null && v2_map.get(key) != null && v2_map.get(key).intValue() > 0){
                return -1;
            } else if (v1_map.get(key) != null && v1_map.get(key) > 0 && v2_map.get(key) == null){
                return 1;
            }
        }

        return 0;
    }

    /**
     * 笨版本
     * @author szl
     * @date 2022/8/3 23:07
     * @param verion1
     * @param version2
     * @return int
     */
    public static int comapare2versionString(String verion1, String version2){

        String[] arr_v1 = verion1.split("\\.");
        String[] arr_v2 = version2.split("\\.");

       List<Integer> list1 = Arrays.stream(arr_v1).map(d -> {
           return str2Integer(d);
       }).collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(arr_v2).map(d -> {
            return str2Integer(d);
        }).collect(Collectors.toList());

        int cha = list1.size() - list2.size();
        if(cha >= 0){
            for (int i = 0; i < cha; i++) {
                list2.add(0);
            }
        } else {
            cha =  Math.abs(cha);
            for (int i = 0; i < cha; i++) {
                list1.add(0);
            }
        }


        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) > list2.get(i)){
                return 1;
            } else if (list1.get(i) < list2.get(i)){
                return -1;
            }
        }

        return 0;
    }

    private static int str2Integer(String d) {
        char[] chars = d.toCharArray();
        if(d.length() > 1 && d.startsWith("0")){
           int from = 0;
            for (int i=0 ;i < chars.length ; i++) {
                if('0' != chars[i]){
                    from = i;
                    break;
                }
            }

            if(from > 0 ){
                d = d.substring(from, d.length());
            } else {
                d = "0";
            }
        }

        return Integer.parseInt(d);
    }


    public static void main(String[] args) {

        String v1 = "1.1";
        String v2 = "1.01";
        int res = comapare2versionString(v1,v2);

        int res2 = compareVersion(v1,v2);

        int res3 = compareVersionWithMap(v1,v2);

        System.out.println(res+"    " +res2 +"   "+ res3);

        List<String[]> listStrArr = new ArrayList<String[]>(
                Arrays.asList(new String[]{"1.1","2.1","-1"},
                              new String[]{"1.1","1.01","0"},
                              new String[]{"1.1","1.0.0","1"},
                              new String[]{"1.1.0","1.010.1","-1"},
                              new String[]{"0.1","1.0.0","-1"},
                              new String[]{"1.0.1","1.000.0","1"},
                              new String[]{"7.5.2.4","7.5.3","-1"})
        );

//        listStrArr.forEach(d -> {
//            System.out.println(JSON.toJSONString(d));
//        });
    }
}


/**
 ** 给你两个版本号 version1 和 version2 ，请你比较它们。
 *  * 版本号由一个或多个修订号组成，各修订号由一个 ‘.’ 连接。每个修订号由 多位数字 组成，可能包含 前导零 。每个版本号至少包含一个字符。修订号从左到右编
 *  * 号，下标从 0 开始，最左边的修订号下标为 0 ，下一个修订号下标为 1 ，以此类推。例如，2.5.33 和 0.1 都是有效的版本号。
 *  * 比较版本号时，请按从左到右的顺序依次比较它们的修订号。比较修订号时，只需比较 忽略任何前导零后的整数值 。也就是说，修订号 1 和修订号 001 相等 。
 *  * 如果版本号没有指定某个下标处的修订号，则该修订号视为 0 。例如，版本 1.0 小于版本 1.1 ，因为它们下标为 0 的修订号相同，而下标为 1 的修订号分别
 *  * 为 0 和 1 ，0 < 1 。
 *  * 返回规则如下：
 *  *
 *  * 如果 version1 > version2 返回 1，
 *  * 如果 version1 < version2 返回 -1，
 *  * 除此之外返回 0。
 *  *
 *  * 示例 1：
 *  *
 *  * 输入：version1 = “1.01”, version2 = “1.001”
 *  * 输出：0
 *  * 解释：忽略前导零，“01” 和 “001” 都表示相同的整数 “1”
 *  *
 *  * 示例 2：
 *  *
 *  * 输入：version1 = “1.0”, version2 = “1.0.0”
 *  * 输出：0
 *  * 解释：version1 没有指定下标为 2 的修订号，即视为 “0”
 *  *
 *  * 示例 3：
 *  *
 *  * 输入：version1 = “0.1”, version2 = “1.1”
 *  * 输出：-1
 *  * 解释：version1 中下标为 0 的修订号是 “0”，version2 中下标为 0 的修订号是 “1” 。0 < 1，所以 version1 < ve
 *  * rsion2
 *  *
 *  * 示例 4：
 *  *
 *  * 输入：version1 = “1.0.1”, version2 = “1”
 *  * 输出：1
 *  * 示例 5：
 *  *
 *  * 输入：version1 = “7.5.2.4”, version2 = “7.5.3”
 *  * 输出：-1
 *  *
 *  * 提示：
 *  *
 *  * 1 <= version1.length, version2.length <= 500
 *  * version1 和 version2 仅包含数字和 ‘.’
 *  * version1 和 version2 都是 有效版本号
 *  * version1 和 version2 的所有修订号都可以存储在 32 位整数 中
 *  * ————————————————
 *  * 版权声明：本文为CSDN博主「知北行」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 *  * 原文链接：https://blog.csdn.net/qq_35077107/article/details/118245393
 */