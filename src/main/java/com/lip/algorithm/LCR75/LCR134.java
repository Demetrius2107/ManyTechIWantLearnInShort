package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR134
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/19 17:54
 */
public class LCR134 {

    // 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。


    public double myPow(double x, int n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res *= x;
            }
            x *= x;
            n /= 2;
        }
        return res;
    }
}
