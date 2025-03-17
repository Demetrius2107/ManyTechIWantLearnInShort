package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR128
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/17 15:30
 */
public class LCR128 {


   /* 示例 1：

    输入：stock = [4,5,8,3,4]
    输出：3
    示例 2：

    输入：stock = [5,7,9,1,2]
    输出：1*/

    public int inventoryManagement(int[] stock) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < stock.length ; i ++ ){
            if(stock[i] < min){
                min = stock[i];
            }
        }
        return min;
    }
}
