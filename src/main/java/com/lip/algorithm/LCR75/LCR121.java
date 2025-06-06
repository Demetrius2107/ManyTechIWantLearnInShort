package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR121
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/17 13:30
 */
public class LCR121 {

   /*
    m*n 的二维数组 plants 记录了园林景观的植物排布情况，具有以下特性：
    每行中，每棵植物的右侧相邻植物不矮于该植物；
    每列中，每棵植物的下侧相邻植物不矮于该植物。
    请判断 plants 中是否存在目标高度值 target。
    示例 1：
    输入：plants = [[2,3,6,8],[4,5,8,9],[5,9,10,12]], target = 8
    输出：true
    示例 2：
    输入：plants = [[1,3,5],[2,5,7]], target = 4
    输出：false
    [
     [2,3,6,8],
     [4,5,8,9],
     [5,9,10,12]
    ]
    */

    public static void main(String[] args) {

    }

    // 暴力
    public boolean findTargetIn2DPlants(int[][] plants, int target) {
        for (int i = 0; i < plants.length; i++) {
            for (int j = 0; j < plants[0].length; j++) {
                if (plants[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 矩阵反转 二叉搜索树
    public boolean findTargetIn2DPlants2(int[][] plants,int target){
        int i = plants.length - 1 , j = 0;
        while( i >= 0 && j < plants[0].length){
            if(plants[i][j] > target) i --;
            else if(plants[i][j] < target) j ++;
            else return true;
        }
        return false;
    }


}
