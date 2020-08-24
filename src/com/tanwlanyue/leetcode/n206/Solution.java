package com.tanwlanyue.leetcode.n206;

import com.tanwlanyue.leetcode.model.ListNode;
import com.tanwlanyue.leetcode.model.Test;
import com.tanwlanyue.leetcode.model.TestCase;

/**
 * 头插法
 * 将原链表的第一个node指向新链表
 * 新链表的指针向左移动
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Test.print(TestCase.ListNode);
        Test.print(new Solution().reverseList(TestCase.ListNode));
    }
}