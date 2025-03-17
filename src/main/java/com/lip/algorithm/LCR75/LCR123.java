package com.lip.algorithm.LCR75;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Elon
 * @title: LCR123
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/17 13:56
 */
public class LCR123 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    ArrayList<Integer> array = new ArrayList<Integer>();
    // 反转链表
    public int[] reverseBookList(ListNode head) {
       recur(head);
       int[] res = new int[array.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = array.get(i);
        }
        return res;
    }

    void recur(ListNode head){
        if(head == null) return;
        recur(head.next);
        array.add(head.val);
    }

}
