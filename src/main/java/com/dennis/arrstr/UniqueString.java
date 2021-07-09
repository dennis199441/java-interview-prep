package com.dennis.arrstr;

public class UniqueString {
    
    /**
     * 256 ASCII characters
     * @param s
     * @return
     */
    public boolean isUnique(String s) {
        if (s.length() > 256) {
            return false;
        }

        boolean[] cnt = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(cnt[c]) {
                return false;
            }
            cnt[c] = true;
        }
        return true;

    }
}
