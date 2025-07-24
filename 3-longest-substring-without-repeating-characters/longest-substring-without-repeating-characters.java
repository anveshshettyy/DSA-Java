class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int l = 0, r = 0, len = 0, maxLen = 0;
        while(r < s.length()) {
            char c = s.charAt(r);
            if(!hs.contains(c)) {
                hs.add(c);
                maxLen = Math.max(maxLen, r-l+1);
                r++;
            } else {
                hs.remove(s.charAt(l));
                l++;
            }
        }
        return maxLen;
    }
}