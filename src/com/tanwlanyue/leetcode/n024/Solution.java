package com.tanwlanyue.leetcode.n024;

import com.tanwlanyue.leetcode.model.ListNode;

/**
 * 递归
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode pre=head;
        if(head==null ||head.next==null){
            return head;
        }
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;
        return next;
    }
}