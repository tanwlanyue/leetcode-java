package com.tanwlanyue.leetcode.model;

public class Test {

    public static void print(ListNode node){
        StringBuilder builder=new StringBuilder();
        if (node==null){
            System.out.println("null");
        }
        builder.append(node.val);
        while (true){
            node=node.next;
            if(node!=null){
                builder.append("→"+node.val);
            }else {
                builder.append("→null");
                break;
            }
        }
        System.out.println(builder.toString());
    }
}
