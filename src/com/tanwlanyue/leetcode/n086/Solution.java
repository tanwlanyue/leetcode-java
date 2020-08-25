package com.tanwlanyue.leetcode.n086;

import com.tanwlanyue.leetcode.model.ListNode;
import com.tanwlanyue.leetcode.model.Test;
import com.tanwlanyue.leetcode.model.TestCase;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode tmpMore=new ListNode(0);
        ListNode tmpLess=new ListNode(0);
        ListNode tmpMorePtr=tmpMore;
        ListNode tmpLessPtr=tmpLess;
        while (head!=null){
            if(head.val<x){
                tmpLessPtr.next=head;
                tmpLessPtr=head;
            }else {
                tmpMorePtr.next=head;
                tmpMorePtr=head;
            }
            head=head.next;
        }
        tmpMorePtr.next=null;
        tmpLessPtr.next=tmpMore.next;
        return tmpLess.next;
    }

    public static void main(String[] args) {
        Test.print(TestCase.RandomListNode);
        Test.print(new Solution().partition(TestCase.RandomListNode,3));
    }
}