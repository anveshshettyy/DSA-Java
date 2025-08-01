class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int l = 0, r = 0, n = s.length();
        int maxLen = 0;

        while(r<n) {
            char c = s.charAt(r);
            if(!set.contains(c)) {
                set.add(c);
                maxLen = Math.max(maxLen, r-l+1);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLen;
        
    }
}