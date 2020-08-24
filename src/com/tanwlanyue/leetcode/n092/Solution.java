package com.tanwlanyue.leetcode.n092;

import com.tanwlanyue.leetcode.model.ListNode;
import com.tanwlanyue.leetcode.model.Test;
import com.tanwlanyue.leetcode.model.TestCase;

/**
 * 注意m=1时的情况
 * 最终返回的是哪个节点
 * 指到m位置时的当前节点是被逆置后的那段的最后一个modifyListTail   记录他的前驱节点 preHead
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int reverseLen=n-m+1;
        ListNode preHead=null;// 开始逆置的节点的前一个节点
        ListNode result=head;// 最终返回的
        // head移动到第m位
        while (head!=null&&--m!=0){
            preHead=head;
            head=head.next;
        }
        ListNode modifyListTail=head;

        // 开始逆置 完成后这段被逆置的头节点是newHead 尾节点是modifyListTail
        ListNode newHead=null;
        while (head!=null&&reverseLen--!=0){
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        modifyListTail.next=head;
        if(preHead!=null){
            preHead.next=newHead;
        }else {
            result=newHead;
        }
        return result;
    }

    public static void main(String[] args) {
        Test.print(TestCase.ListNode);
        Test.print(new Solution().reverseBetween(TestCase.ListNode,2,4));
    }
}
