package com.dennis.arrstr;

public class StringCompression {

    public String compress(String s) {
        StringBuffer buffer = new StringBuffer();
        int cnt = 1;
        char cur = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == cur) {
                cnt++;
            } else {
                buffer.append(cur);
                buffer.append(cnt);
                cur = s.charAt(i);
                cnt = 1;
            }
        }

        buffer.append(cur);
        buffer.append(cnt);
        
        if (buffer.length() < s.length()) {
            return buffer.toString();
        }

        return s;
    }
}