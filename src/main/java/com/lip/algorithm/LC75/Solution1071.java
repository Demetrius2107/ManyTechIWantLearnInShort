package com.lip.algorithm.LC75;

/**
 * @author: Elon
 * @title: Solution1071
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/28 10:29
 */
public class Solution1071 {

/*
    对于字符串 s 和 t，只有在 s = t + t + t + ... + t + t（t 自身连接 1 次或多次）时，我们才认定 “t 能除尽 s”。
    给定两个字符串 str1 和 str2 。返回 最长字符串 x，要求满足 x 能除尽 str1 且 x 能除尽 str2 。
    示例 1：
    输入：str1 = "ABCABC", str2 = "ABC"
    输出："ABC"
    示例 2：
    输入：str1 = "ABABAB", str2 = "ABAB"
    输出："AB"
    示例 3：
    输入：str1 = "LEET", str2 = "CODE"
    输出：""*/

    public static void main(String[] args) {

    }

    public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        for (int i = Math.min(l1, l2); i >= 1; --i) {
            if (l1 % i == 0 && l2 % i == 0) {
                String x = str1.substring(0, i);
                if (check(x, str1) && check(x, str2)) {
                    return x;
                }
            }
        }

        return "";
    }

    public boolean check(String t, String s) {
        int lenx = s.length() / t.length();
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i <= lenx; i++) {
            ans.append(t);
        }
        return ans.toString().equals(s);
    }
}
