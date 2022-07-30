package com.szl.letck.leetcode.string;

/**
 *  最长无重复字符串
 *  给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *  示例 1:
 *      输入: s = "abcabcbb"
 *      输出: 3
 *      解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3
 *
 *  示例 2:
 *      输入: s = "bbbbb"
 *      输出: 1
 *      解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 *  示例 3:
 *      输入: s = "pwwkew"
 *      输出: 3
 *      解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters
 *
 * 提示：
 * 0 <= s.length <= 5 * 10 的4次方
 * s 由英文字母、数字、符号和空格组成
 */
public class Longest_string_no_repeat {

    public static void main(String[] args) {
        int max = lengthOfLongestSubstring(" ");
        System.out.printf("max:" + max);
    }

    private static int solution(String s){
        if(s!= null && s.length() > 0 && s != ""){
            int[] len = new int[s.length()];
            char[] chars =  s.toCharArray();
            int i = 0;
            while (i < s.length()){
                String ts = ""+chars[i];
                for (int j = i+1 ; j < chars.length ; j ++){
                    char t = chars[j];
                    if(ts.contains(t+"")){
                        len[i] = ts.length();
                        break;
                    } else {
                        ts+= t;
                    }
                }
                i++;
            }

            int max = len[0];
            for (int t = 1 ; t < len.length ; t++){
                if(max < len[t]){
                    max = len[t];
                }
            }

            return max;
        }

        return 0;
    }

    private static int lengthOfLongestSubstring(String s) {

        String ts = "";
        int m = 0;

        for (int i = 0; i < s.length(); i++) {
            if(ts.contains(s.charAt(i) + "")) {
                ts = ts.substring(ts.indexOf(s.charAt(i)) + 1, ts.length());
            }

            ts += s.charAt(i);
            m = m > ts.length()  ? m :ts.length();
        }

        return m ;
    }
}
