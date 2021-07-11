package com.dennis.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLastElementTest {
    
    final KthLastElement kle = new KthLastElement();
    
    @Test
    public void kthLastElementTest1() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        assertEquals(4, kle.kthLastElementIterative(input, k));
    }

}
