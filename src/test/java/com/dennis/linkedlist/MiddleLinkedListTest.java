package com.dennis.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MiddleLinkedListTest {
    
    final MiddleLinkedList mll = new MiddleLinkedList();

    @Test
    public void middleLinkedListTest1() {
        ListNode tail = new ListNode(5);
        ListNode fourth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);

        assertEquals(third.data, mll.findMiddle(head).data);
    }

    @Test
    public void middleLinkedListTest2() {
        ListNode fourth = new ListNode(4);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);

        assertEquals(third.data, mll.findMiddle(head).data);
    }
}
