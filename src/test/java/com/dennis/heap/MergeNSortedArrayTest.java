package com.dennis.heap;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeNSortedArrayTest {

    final MergeNSortedArray msa = new MergeNSortedArray();

    @Test
    public void mergeNSortedArrayTest1() {
        int k = 3;
        int[][] input = { { 1, 3, 5 }, { 2, 4, 6 } };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        assertArrayEquals(expected, msa.mergeNSortedArray(input, k));
    }

    @Test
    public void mergeNSortedArrayTest2() {
        int k = 3;
        int[][] input = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertArrayEquals(expected, msa.mergeNSortedArray(input, k));
    }

    @Test
    public void mergeNSortedArrayTest3() {
        int k = 3;
        int[][] input = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int[] expected = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        assertArrayEquals(expected, msa.mergeNSortedArray(input, k));
    }

    @Test
    public void mergeNSortedArrayTest4() {
        int k = 3;
        int[][] input = { { 1, 7, 11 }, { 6, 8, 9 }, { 3, 4, 10 } };
        int[] expected = { 1, 3, 4, 6, 7, 8, 9, 10, 11 };
        assertArrayEquals(expected, msa.mergeNSortedArray(input, k));
    }
}
