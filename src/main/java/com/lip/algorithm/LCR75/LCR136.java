package com.lip.algorithm.LCR75;

/**
 * @author: Elon
 * @title: LCR136
 * @projectName: ManyTechIWantLearnInShort
 * @description: TODO
 * @date: 2025/3/20 9:58
 */
public class LCR136 {

    /**
     * Definition for singly-linked list.
     */
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

        /*给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
        返回删除后的链表的头节点。
        示例 1：
        输入：head = [4,5,1,9], val = 5
        输出：[4,1,9]
        解释：给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
        示例 2：
        输入：head = [4,5,1,9], val = 1
        输出：[4,5,9]
        解释：给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.*/

        class Solution {
            public ListNode deleteNode(ListNode head, int val) {
                /*if(head.val == val) return head.next;
                ListNode pre = head, cur = head.next;
                while(cur != null && cur.val != val) {
                    pre = cur;
                    cur = cur.next;
                }
                if(cur != null) pre.next = cur.next;
                return head;*/
                if(head.val == val) return head.next;
                ListNode pre = head, cur = head.next;
                while(cur != null && cur.val != val){
                    pre = cur;
                    cur = cur.next;
                }
                if( cur != null) pre.next = cur.next;
                return head;
            }
        }
    }

}