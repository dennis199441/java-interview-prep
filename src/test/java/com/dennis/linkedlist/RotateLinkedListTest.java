package com.dennis.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RotateLinkedListTest {
    
    final RotateLinkedList rll = new RotateLinkedList();

    @Test
    public void rotateLinkedListTest1() {
        ListNode tail = new ListNode(5);
        ListNode fourth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);

        ListNode tail2 = new ListNode(2);
        ListNode fourth2 = new ListNode(1, tail2);
        ListNode third2 = new ListNode(5, fourth2);
        ListNode second2 = new ListNode(4, third2);
        ListNode head2 = new ListNode(3, second2);

        ListNode rotated = rll.rotate(head, 2);
        ListNode cur1 = rotated;
        ListNode cur2 = head2;
        while (cur1 != null && cur2 != null) {
            assertEquals(cur2.data, cur1.data);
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        
    }

}
