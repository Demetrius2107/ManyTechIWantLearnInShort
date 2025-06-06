package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR135
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/20 9:53
 */
public class LCR135 {

    public static void main(String[] args) {

    }

    /*    实现一个十进制数字报数程序，
    请按照数字从小到大的顺序返回一个整数数列，
    该数列从数字 1 开始，到最大的正整数 cnt 位数字结束。*/
    public int[] countNumbers(int cnt) {
        int end = (int)Math.pow(10, cnt) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }
}
