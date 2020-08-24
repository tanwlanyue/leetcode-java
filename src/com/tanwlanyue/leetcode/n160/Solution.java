package com.tanwlanyue.leetcode.n160;

import com.tanwlanyue.leetcode.model.ListNode;

/**
 * 尾部对齐 指针位置相对尾部相同 再移动比较
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=getListLen(headA);
        int lenB=getListLen(headB);
        int len=lenA-lenB;
        // 移动对齐
        if(len>0){
            while (headA!=null&&len--!=0){
                headA=headA.next;
            }
        }else {
            while (headB!=null&&len++!=0){
                headB=headB.next;
            }
        }
        // 同时移动比较
        while (headA!=null&&headB!=null){
            if(headA==headB){
                return headA;
            }else {
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;
    }

    public int getListLen(ListNode node){
        int len=0;
        while (node!=null){
            node=node.next;
            len++;
        }
        return len;
    }
}