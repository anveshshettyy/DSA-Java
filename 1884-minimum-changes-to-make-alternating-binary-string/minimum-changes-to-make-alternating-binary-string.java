class Solution {
    public int minOperations(String s) {
        char count = s.charAt(0);
        int res1 = 0;
        for (int i = 1; i < s.length(); i++) {
            count = (count == '0') ? '1' : '0';
            if (s.charAt(i) != count) res1++;    
        }

        count = s.charAt(0);
        count = (count == '0') ? '1' : '0';
        int res2 = 1;
        for (int i = 1; i < s.length(); i++) {
            count = (count == '0') ? '1' : '0';
            if (s.charAt(i) != count) res2++;    
        }

        return Math.min(res1, res2);
    }
}