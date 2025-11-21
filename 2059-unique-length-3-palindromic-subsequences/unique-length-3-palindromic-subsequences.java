class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int ans = 0;

        // For each possible outer character 'a' to 'z'
        for(char ch = 'a'; ch <= 'z'; ch++) {
            int first = -1, last = -1;

            // find first & last occurrence
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == ch) {
                    if(first == -1) first = i;
                    last = i;
                }
            }

            if(first == -1 || last - first < 2) continue;

            // track middle distinct characters
            boolean[] seen = new boolean[26];
            for(int i = first + 1; i < last; i++) {
                seen[s.charAt(i) - 'a'] = true;
            }

            for(boolean b : seen) if(b) ans++;
        }

        return ans;
    }
}
