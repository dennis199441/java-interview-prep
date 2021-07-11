package com.dennis.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class HeapNode {
    int arrIdx;
    int itemIdx;
    int value;

    HeapNode(int arrIdx, int itemId, int value) {
        this.arrIdx = arrIdx;
        this.itemIdx = itemId;
        this.value = value;
    }
}

public class MergeNSortedArray {

    public int[] mergeNSortedArray(int[][] arr, int k) {
        int[] out = new int[arr.length * k];
        PriorityQueue<HeapNode> minHeap = new PriorityQueue<HeapNode>(arr.length, new Comparator<HeapNode>() {
            @Override
            public int compare(HeapNode a, HeapNode b) {
                if (a.value < b.value) {
                    return - 1;
                }
                return 1;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            HeapNode n = new HeapNode(i, 0, arr[i][0]);
            minHeap.add(n);
        }

        int cur = 0;
        while (minHeap.size() > 0) {
            HeapNode n = minHeap.poll();
            out[cur++] = n.value;
            if(n.itemIdx + 1 < arr[n.arrIdx].length) {
                minHeap.add(new HeapNode(n.arrIdx, n.itemIdx + 1, arr[n.arrIdx][n.itemIdx + 1]));
            }
        }

        return out;
    }
}
