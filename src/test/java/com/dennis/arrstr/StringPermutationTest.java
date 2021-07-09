package com.dennis.arrstr;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StringPermutationTest {

    final StringPermutation sp = new StringPermutation();

    @Test
    public void stringPermutationTest1() {
        String a = "abcde";
        String b = "bcdae";
        assertTrue(sp.isPermutation(a, b));
    }

    @Test
    public void stringPermutationTest2() {
        String a = "abcde";
        String b = "bcdfe";
        assertFalse(sp.isPermutation(a, b));
    }
}
