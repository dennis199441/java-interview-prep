package com.dennis.arrstr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompressionTest {
    
    final StringCompression sc = new StringCompression();

    @Test
    public void stringCompressionTest1() {
        String s = "aaabbbccc";
        String compressed = "a3b3c3";
        assertEquals(compressed, sc.compress(s));
    }

    @Test
    public void stringCompressionTest2() {
        String s = "abbcddd";
        // String compressed = "a1b2c1d3";
        assertEquals(s, sc.compress(s));
    }
}
