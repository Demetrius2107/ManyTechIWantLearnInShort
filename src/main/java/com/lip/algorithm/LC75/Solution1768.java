package com.lip.algorithm.LC75;

/**
 * @author: Elon
 * @title: Solution1768
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/28 10:11
 */
public class Solution1768 {

    public static void main(String[] args) {

    }

    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();

        if (len1 < len2) {
            for (int i = 0; i < len1; i++) {
                char w1 = word1.charAt(i);
                char w2 = word2.charAt(i);
                sb.append(w1);
                sb.append(w2);
            }
            for (int j = len1; j < len2; j++) {
                char w3 = word2.charAt(j);
                sb.append(w3);
            }
        } else {
            for (int i = 0; i < len2; i++) {
                char w1 = word2.charAt(i);
                char w2 = word1.charAt(i);
                sb.append(w2);
                sb.append(w1);
            }
            for (int j = len2; j < len1; j++) {
                char w3 = word1.charAt(j);
                sb.append(w3);
            }
        }

        return sb.toString();
    }
}
