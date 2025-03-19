package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR133
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/19 17:32
 */
public class LCR133 {

    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            String num = Integer.toBinaryString(n);
            char[] nums = num.toCharArray();
            int count = 0;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] == '1'){
                    count ++;
                }
            }
            return count;
        }


        public int hammingWeight2(int n) {
            int res = 0;
            while(n != 0) {
                res++;
                n &= n - 1;
            }
            return res;
        }
    }
}
