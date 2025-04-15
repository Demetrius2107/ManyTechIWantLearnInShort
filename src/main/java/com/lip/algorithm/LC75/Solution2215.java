package com.lip.algorithm.LC75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: Elon
 * @title: Solution2215
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/4/8 23:13
 */
public class Solution2215 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> ser2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!set1.contains(nums1[i])) {
                set1.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!ser2.contains(nums2[i])) {
                ser2.add(nums2[i]);
            }
        }
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            if(!set1.contains(nums2[i])){
                arr1.add(nums2[i]);
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            if(!ser2.contains(nums1[i])){
                arr2.add(nums1[i]);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(arr2.stream()
                .distinct()
                .collect(Collectors.toList()));
        res.add(arr1.stream()
                .distinct()
                .collect(Collectors.toList()));

        return res;

    }
}
