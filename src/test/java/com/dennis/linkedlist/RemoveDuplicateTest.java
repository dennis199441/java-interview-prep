package com.dennis.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RemoveDuplicateTest {
    
    final RemoveDuplicate rd = new RemoveDuplicate();

    @Test
    public void removeDuplicateTest1() {

        ListNode input = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5))));

        ListNode out = rd.removeDuplicate(input);
        ListNode cur1 = expected, cur2 = out;
        assertNotNull(out);
        while (cur1 != null || cur2 != null) {
            System.out.format("expected: %d, out: %d\n", cur1.data, cur2.data);
            assertEquals(cur1.data, cur2.data);
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
    }
}
