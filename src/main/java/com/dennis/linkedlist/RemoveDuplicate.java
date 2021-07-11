package com.dennis.linkedlist;

import java.util.HashSet;

public class RemoveDuplicate {
    
    public ListNode removeDuplicate(ListNode head) {
        HashSet<Integer> seen = new HashSet<>();
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            if(seen.contains(cur.data)) {
                prev.next = cur.next;
            } else {
                seen.add(cur.data);
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
