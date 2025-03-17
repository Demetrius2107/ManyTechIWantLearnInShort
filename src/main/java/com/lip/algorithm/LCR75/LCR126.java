package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR126
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/17 15:06
 */
public class LCR126 {

    public static void main(String[] args) {

    }

    private static final int MOD = 1000000007;

    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int res = (fib(n - 1) + fib(n -2) ) % MOD;
        return res % 1000000007;
    }


    public int fibMemoization(int n){
        // MOD
        int MOD = 1000000007;
        int[] memo = new int[n + 1];
        // init
        for(int i = 0 ; i <= n; i ++){
            memo[i] = -1;
        }
        return fib(n);
    }
}

class Solution {
    private static final int MOD = 1000000007;
    // 用于存储已经计算过的斐波那契数
    private int[] memo;

    public int fib(int n) {
        // 初始化 memo 数组，长度为 n + 1，用于存储 0 到 n 的斐波那契数
        memo = new int[n + 1];
        // 初始值设为 -1，表示该位置的斐波那契数还未计算
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        return helper(n);
    }

    private int helper(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // 如果 memo[n] 已经计算过，直接返回结果
        if (memo[n] != -1) {
            return memo[n];
        }
        // 递归计算 fib(n - 1) 和 fib(n - 2)，并将结果存储到 memo[n] 中
        memo[n] = (helper(n - 1) + helper(n - 2)) % MOD;
        return memo[n];
    }
}