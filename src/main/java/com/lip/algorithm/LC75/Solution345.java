package com.lip.algorithm.LC75;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Elon
 * @title: Solution345
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/28 11:36
 */
public class Solution345 {

 /*   给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。

    元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。



    示例 1：

    输入：s = "IceCreAm"

    输出："AceCreIm"

    解释：

    s 中的元音是 ['I', 'e', 'e', 'A']。反转这些元音，s 变为 "AceCreIm".

    示例 2：

    输入：s = "leetcode"

    输出："leotcede"*/

    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0 ,right = s.length() - 1;
        while(left < right){
            while(left <right && !vowels.contains(String.valueOf(chars[left]))){
                left ++;
            }
            while(left <right && !vowels.contains(String.valueOf(chars[right]))){
                right --;
            }
            if(left <right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left ++;
                right --;
            }
        }
        return new String(chars);
    }

   /* Map<Integer,Character> map = new HashMap<>();
    *//* for (int i = 0; i < s.length(); i++) {
         char pos = s.charAt(i);
         if(pos == 'a' || pos =='e' || pos == 'i' || pos == 'o' || pos == 'u'
                 || pos == 'A' || pos == 'E' ||
          pos == 'O' || pos == 'I' || pos == 'U'){
             map.put(i,pos);
         }
     }*//*
    char[] res = s.toCharArray();
    char[] loc = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
        char pos = s.charAt(i);
        if(pos == 'a' || pos =='e' || pos == 'i' || pos == 'o' || pos == 'u'
                || pos == 'A' || pos == 'E' ||
                pos == 'O' || pos == 'I' || pos == 'U'){
            loc[i] = pos;
        }
    }
    StringBuilder sb = new StringBuilder();
    int index = 0;
        for (int j = s.length() - 1; j > 0; j --) {

        char pos = s.charAt(j);
        if(pos == 'a' || pos =='e' || pos == 'i' || pos == 'o' || pos == 'u'
                || pos == 'A' || pos == 'E' ||
                pos == 'O' || pos == 'I' || pos == 'U'){
            sb.append(loc[index]);
            index++;
        }
        sb.append(pos);
    }
        return sb.reverse().toString();*/
}
