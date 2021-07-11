package com.dennis.linkedlist;

public class KthLastElement {

    public int kthLastElementIterative(ListNode head, int k) {
        ListNode cur1 = head, cur2 = head;
        for (int i = 0; i < k - 1; i++) {
            cur2 = cur2.next;
        }

        while(cur2.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return cur1.data;
    }
}
