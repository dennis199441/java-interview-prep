package com.dennis.arrstr;

public class StringPermutation {

    public boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int n = a.length();
        int[] cnt = new int[26]; // Depends on the problem statement

        for (int i = 0; i < n; i++) {
            cnt[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (--cnt[b.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
