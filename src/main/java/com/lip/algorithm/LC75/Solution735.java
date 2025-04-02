package com.lip.algorithm.LC75;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author: Elon
 * @title: Solution735
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/4/2 13:29
 */
public class Solution735 {

  /*  给定一个整数数组 asteroids，表示在同一行的小行星。数组中小行星的索引表示它们在空间中的相对位置。
    对于数组中的每一个元素，其绝对值表示小行星的大小，正负表示小行星的移动方向（正表示向右移动，负表示向左移动）。
    每一颗小行星以相同的速度移动。
    找出碰撞后剩下的所有小行星。碰撞规则：两个小行星相互碰撞，较小的小行星会爆炸。
    如果两颗小行星大小相同，则两颗小行星都会爆炸。两颗移动方向相同的小行星，永远不会发生碰撞。
    示例 1：
    输入：asteroids = [5,10,-5]
    输出：[5,10]
    解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。
    示例 2：
    输入：asteroids = [8,-8]
    输出：[]
    解释：8 和 -8 碰撞后，两者都发生爆炸。
    示例 3：
    输入：asteroids = [10,2,-5]
    输出：[10]
    解释：2 和 -5 发生碰撞后剩下 -5 。10 和 -5 发生碰撞后剩下 10 。

    [10,2,-5]

    [5,10,-5]  -- > [0,10]  --- [5,10]
*/

   /* public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
       *//* for (int i = 0; i < asteroids.length; i++) {
            int num = asteroids[i];

            if(num > 0){
                stack.push(num);
            }else {
                if(!stack.isEmpty()){
                    num = -num;
                    int peek = stack.peek();
                    if(peek - num < 0){
                        stack.pop();
                        stack.push(-num);
                    }else if(peek - num  == 0 ){
                        stack.pop();
                    }
                }
            }
        }*//*

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                // 向右移动的行星直接入栈
                stack.push(asteroid);
            } else {
                // 向左移动的行星
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    // 栈顶行星小于当前向左移动的行星的绝对值，栈顶行星爆炸
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    // 栈为空或栈顶行星也向左移动，当前行星入栈
                    stack.push(asteroid);
                } else if (stack.peek() == -asteroid) {
                    // 栈顶行星与当前行星大小相同，两者都爆炸
                    stack.pop();
                }
            }
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i > 0 ; i--) {
            res[i] = stack.pop();
        }

        return res;
    }*/

 /*   使用栈 st 模拟行星碰撞，从左往右遍历行星数组 asteroids，
 当我们遍历到行星 aster 时，使用变量 alive 记录行星 aster 是否还存在（即未爆炸）。

    当行星 aster 存在且 aster<0，栈顶元素非空且大于 0 时，说明两个行星相互向对方移动：
    如果栈顶元素大于等于 −aster，则行星 aster 发生爆炸，将 alive 置为 false；
    如果栈顶元素小于等于 −aster，则栈顶元素表示的行星发生爆炸，执行出栈操作。
    重复以上判断直到不满足条件，如果最后 alive 为真，说明行星 aster 不会爆炸，则将 aster 入栈。

    作者：力扣官方题解
    链接：https://leetcode.cn/problems/asteroid-collision/solutions/1663442/xing-xing-peng-zhuang-by-leetcode-soluti-u3k0/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    */
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int aster : asteroids) {
            boolean alive = true;
            while (alive && aster < 0 && !stack.isEmpty() && stack.peek() > 0) {
                alive = stack.peek() < -aster;
                // aster 是否存在
                if (stack.peek() <= -aster) {
                    // 栈顶行星爆炸
                    stack.pop();
                }
            }
            if (alive) {
                stack.push(aster);
            }
        }
        int size = stack.size();
        int[] ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }

  /*  作者：力扣官方题解
    链接：https://leetcode.cn/problems/asteroid-collision/solutions/1663442/xing-xing-peng-zhuang-by-leetcode-soluti-u3k0/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/

}
