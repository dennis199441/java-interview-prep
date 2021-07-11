package com.dennis.heap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunningMedianTest {

    final RunningMedian rm = new RunningMedian();

    @Test
    public void RunningMedianTest1() {
        int[] input = { 12, 4, 5, 3, 8, 7 };
        double[] expected = { 12.0, 8.0, 5.0, 4.5, 5.0, 6.0 };
        double[] output = rm.runningMedian(input);
        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i], output[i], 0);
        }
    }
}
