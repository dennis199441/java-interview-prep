package com.dennis.arrstr;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UniqueStringTest {
    
    final UniqueString us = new UniqueString();

    @Test
    public void uniqueStringTest1() {
        String s = "abcde";
        assertTrue(us.isUnique(s));
    }

    @Test
    public void uniqueStringTest2() {
        String s = "abcae";
        assertFalse(us.isUnique(s));
    }

}
