package com.dennis.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ReverseLinkedListTest {
    
    final ReverseLinkedList rll = new ReverseLinkedList();

    @Test
    public void reverseLinkedListTest1() {
        ListNode tail = new ListNode(5);
        ListNode fourth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        
        ListNode head2 = rll.reverseIterative(head);
        assertNotNull(head2);
        ListNode cur = head2;
        int i = 5;
        while (cur != null) {
            assertEquals(i, cur.data);
            cur = cur.next;
            i--;
        }
    }

    @Test
    public void reverseLinkedListTest2() {
        ListNode tail = new ListNode(5);
        ListNode fourth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        
        ListNode head2 = rll.reverseRecursive(head);
        assertNotNull(head2);
        ListNode cur = head2;
        int i = 5;
        while (cur != null) {
            assertEquals(i, cur.data);
            cur = cur.next;
            i--;
        }
    }
}
