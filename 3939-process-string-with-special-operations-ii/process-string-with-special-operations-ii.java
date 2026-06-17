class Solution {
    public char processStr(String s, long k) {
        long len = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                len++;
            } else if (c == '*') {
                if (len > 0) len--;
            } else if (c == '#') {
                len *= 2;
            }
        }

        if (k >= len) return '.';

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (k == len - 1) return c;
                len--;
            } else if (c == '*') {
                len++;
            } else if (c == '#') {
                long half = len / 2;
                k %= half;
                len = half;
            } else if (c == '%') {
                k = len - 1 - k;
            }
        }

        return '.';
    }
}