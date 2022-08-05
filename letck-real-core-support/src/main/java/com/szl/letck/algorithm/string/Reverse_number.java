package com.szl.letck.algorithm.string;

/**
 * @ClassName Reverse_number
 * @Desc  输入 123， 输出  321
 * @Author szl
 * @Version 1.0
 * @Date 2022/8/5 17:58
 */
public class Reverse_number {

    public static void main(String[] args) {
        int target = 123;
//        int res = reverseNum(target);
//        System.out.println(res);


    }

    private static int reverseNum(int target){

        String num_str = Integer.toString(target);

        if(num_str.length() < 1){
            return target;
        }

        char[] chars = num_str.toCharArray();

        char[] res_chars= new char[chars.length];
        num_str = "";
        for (int i = chars.length - 1 ; i >= 0  ; i--) {
            num_str += String.valueOf(chars[i]);
//            res_chars[chars.length - i -1] = chars[i];
        }

//        num_str = String.valueOf(res_chars);

        return Integer.parseInt(num_str);

    }

}
