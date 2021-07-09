package com.dennis.arrstr;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TwoSumTest {
    /**
     * Rigorous Test :-)
     */
    final TwoSum ts = new TwoSum();

    @Test
    public void twoSumTest1() {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 9, 2 };
        int[] out = { 1, 2 };
        assertArrayEquals(out, ts.twoSum(arr, 7));
    }

    @Test
    public void twoSumTest2() {
        int[] arr = { 1, 4, 5, 6, 7, 8, 9, 2 };
        int[] out = { 0, 3 };
        assertArrayEquals(out, ts.twoSum(arr, 7));
    }

    @Test
    public void twoSumTest3() {
        int[] arr = { 1, 3, 7, 8, 9, 2 };
        int[] out = { -1, -1 };
        assertArrayEquals(out, ts.twoSum(arr, 7));
    }

    @Test
    public void twoSumTest4() {
        int[] arr = { 1, 3, -4, 5, 0, 7, 2 };
        int[] out = { 4, 5 };
        assertArrayEquals(out, ts.twoSum(arr, 7));
    }

}
