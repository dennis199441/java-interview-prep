package com.dennis.linkedlist;

public class ReverseLinkedList {

    public ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode rest = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public ListNode reverseIterative(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
