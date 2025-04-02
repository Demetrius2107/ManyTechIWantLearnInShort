package com.lip.algorithm.LC75;

import java.util.Stack;

/**
 * @author: Elon
 * @title: Solution2390
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/4/2 13:03
 */
public class Solution2390 {


    public static void main(String[] args) {

    }

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
           // stack.push(s.charAt(i));
            /*if(!stack.isEmpty()){
                char c = stack.peek();
                if(c == '*'){
                    stack.pop();
                    stack.pop();
                }
            }*/
            char c = stack.peek();
            if(c == '*'){
                stack.pop();
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
