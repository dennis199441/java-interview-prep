package com.dennis.linkedlist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CycleDetectionTest {
    
    final CycleDetection cd = new CycleDetection();

    @Test
    public void cycleDetectionTest1() {
        ListNode tail = new ListNode(5);
        ListNode fourth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        tail.next = second;

        assertTrue(cd.hasCycle(head));
    }

    @Test
    public void cycleDetectionTest2() {
        ListNode tail = new ListNode(5);
        ListNode fourth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);

        assertFalse(cd.hasCycle(head));
    }
}
