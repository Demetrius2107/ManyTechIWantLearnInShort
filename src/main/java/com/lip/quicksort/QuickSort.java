package com.lip.quicksort;

/**
 * @author: Elon
 * @title: QuickSort
 * @projectName: ScannerPractice
 * @description: TODO
 * @date: 2025/3/14 10:26
 */
public class QuickSort {

    public static void main(String[] args) {

    }



    private void swap(int[] nums , int left, int right){
        if(nums[left] > nums[right]){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
    }

}
