package com.lip.algorithm.LC75;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: Elon
 * @title: Solution283
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/28 15:39
 */
public class Solution283 {

    public void moveZeroes(int[] nums) {
        int index =0;
        int[] res = new int[nums.length];
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(list.get(i) == 0){
                list.remove(i);
                index ++;
            }
        }

        for (int i = 0; i < nums.length ; i++) {
            if(list.get(i) != null){
                res[i] = list.get(i);
            }
        }

        for (int i = 0; i < index; i++) {

        }
    }
}
