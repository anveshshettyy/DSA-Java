class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int len = 0, maxLen = 0;
        int r = 0, l = 0;
        while(r < s.length()) {
            char c = s.charAt(r);
            if(!set.contains(c)) {
                set.add(c);
                len = r - l + 1;
                maxLen = Math.max(maxLen, len);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }

        return maxLen;
    }
}