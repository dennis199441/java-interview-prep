package com.dennis.linkedlist;

public class RotateLinkedList {

    public ListNode rotate(ListNode head, int k) {
        if (k == 0) {
            return head;
        }

        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = head;
        cur = head;
        for (int i = 0; i < k - 1; i++) {
            cur = cur.next;
        }

        head = cur.next;
        cur.next = null;
        return head;
    }

}
