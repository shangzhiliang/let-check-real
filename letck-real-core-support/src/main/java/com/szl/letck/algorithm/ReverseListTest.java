package com.szl.letck.algorithm;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName ReverseListTest
 * @Desc 翻转单链表
 * 如当输入链表{1,2,3}时，
 * 经反转后，原链表变为{3,2,1}，所以对应的输出为{3,2,1}。
 * @Author szl
 * @Version 1.0
 * @Date 2022/7/25 22:27
 */
public class ReverseListTest {

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.setVal(1);
        ListNode head2 = new ListNode();
        head2.setVal(2);
        head.setNext(head2);
        ListNode head3 = new ListNode();
        head3.setVal(3);
        head2.setNext(head3);

        System.out.println(JSON.toJSONString(head));

        ListNode newList = reverseList(head);

        System.out.println(JSON.toJSONString(newList));
    }

    private static ListNode reverseList(ListNode head){
        if(head == null){
            return null;
        }

        ListNode cur = head;
        ListNode pre = null;

        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;

    }


}

 class  ListNode {
    int val;

    ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

