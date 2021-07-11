package com.dennis.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {
    
    public double[] runningMedian(int[] arr) {
        double[] out = new double[arr.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(arr.length);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(arr.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return -Integer.compare(a, b);
            }
        });

        for(int i = 0; i < arr.length; i++) {
            if(maxHeap.peek() == null || arr[i] < maxHeap.peek()) {
                maxHeap.add(arr[i]);
            } else {
                minHeap.add(arr[i]);
            }

            while(Math.abs(maxHeap.size() - minHeap.size()) > 1) {
                if(maxHeap.size() > minHeap.size()) {
                    minHeap.add(maxHeap.poll());
                } else {
                    maxHeap.add(minHeap.poll());
                }
            }

            if(maxHeap.size() == minHeap.size()) {
                double meaian = (minHeap.peek() + maxHeap.peek()) / 2.0;
                out[i] = meaian;
            } else if(maxHeap.size() > minHeap.size()) {
                out[i] = (double) maxHeap.peek();
            } else {
                out[i] = (double) minHeap.peek();
            }
        }

        return out;
    }
}
