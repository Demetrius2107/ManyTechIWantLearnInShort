package com.lip.algorithm.LC75;

/**
 * @author: Elon
 * @title: Solution238
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/28 12:31
 */
public class Solution238 {

    /**
     * 前缀积和后缀积
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int len = nums.length;
        int[] L = new int[len];
        int[] R = new int[len];

        // 前缀
        L[0] = 1;
        for (int i = 1; i < len; i++) {
            L[i] = L[i - 1] * nums[i - 1];
        }


        // 后缀
        R[len - 1] = 1;
        for (int j = len - 2; j >= 0 ; j --) {
            R[j] = R[j + 1] * nums[j + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = L[i] * R[i];
        }

        return res;
    }


}
