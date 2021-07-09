package com.dennis.arrstr;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public int[] twoSum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] idx = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(sum - arr[i])) {
                idx[0] = map.get(sum - arr[i]);
                idx[1] = i;
                break;
            } else {
                map.put(arr[i], i);
            }
        }
        return idx;
    }

}
