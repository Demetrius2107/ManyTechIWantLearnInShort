package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR129
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/17 15:38
 */
public class LCR129 {
    public boolean wordPuzzle(char[][] grid, String target) {
        return false;
    }


    boolean dfs(char[][] grid, char[] target, int i, int j, int k) {
        if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0 || grid[i][j] != target[k]) {
            return false;
        }
        if (k == target.length - 1)
            return true;

        return true;
    }
}
