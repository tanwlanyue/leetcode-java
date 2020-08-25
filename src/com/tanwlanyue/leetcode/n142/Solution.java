package com.tanwlanyue.leetcode.n142;

import com.tanwlanyue.leetcode.model.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode meet=null;
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
            if(fast==null){
                return null;
            }
            fast=fast.next;
            if(fast==slow){
                meet=fast;
                break;
            }

        }
        if(meet==null){
            return null;
        }
        while (head!=null&&meet!=null){
            if(head==meet){
                return meet;
            }
            head=head.next;
            meet=meet.next;
        }
        return null;
    }
}
