package com.tanwlanyue.leetcode.n141;

import com.tanwlanyue.leetcode.model.ListNode;

/**
 * 注意只有一个节点的情况
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode meet=null;
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
            if(fast==null){
                return false;
            }
            fast=fast.next;
            if(fast==slow){
                return true;
            }

        }
        return false;
    }
}