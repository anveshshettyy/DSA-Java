class Solution {
    public int minOperations(String s) {
        char count = s.charAt(0);
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            if (count == '0') {
                count = '1';
            } else {
                count = '0';
            }
            if (c != count)
                res++;
        }
        count = s.charAt(0);
        int res1 = 1;
        if (count == '0') {
            count = '1';
        } else {
            count = '0';
        }

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            if (count == '0') {
                count = '1';
            } else {
                count = '0';
            }
            if (c != count)
                res1++;
        }

        return Math.min(res, res1);
    }
}