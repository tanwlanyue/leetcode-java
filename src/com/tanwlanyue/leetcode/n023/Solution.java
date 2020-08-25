package com.tanwlanyue.leetcode.n023;

import com.tanwlanyue.leetcode.model.ListNode;

/**
 * 分治
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }else if(lists.length==1){
            return lists[0];
        }else if(lists.length==2){
            return mergeTwoLists(lists[0],lists[1]);
        }
        int mid=lists.length/2;
        ListNode[] list1=new ListNode[mid];
        ListNode[] list2=new ListNode[lists.length-mid];
        for (int i = 0; i < mid; i++) {
            list1[i]=lists[i];
        }
        for (int i = mid, j=0; i <lists.length; i++,j++) {
            list2[j]=lists[i];
        }
        ListNode node1=mergeKLists(list1);
        ListNode node2=mergeKLists(list2);
        return mergeTwoLists(node1,node2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode ptr=result;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                ptr.next=l1;
                l1=l1.next;
            }else {
                ptr.next=l2;
                l2=l2.next;
            }
            ptr=ptr.next;
        }
        if(l1!=null){
            ptr.next=l1;
        }
        if(l2!=null){
            ptr.next=l2;
        }
        return result.next;
    }
}