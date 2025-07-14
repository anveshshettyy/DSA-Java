class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();

        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        int right = 0, left = 0, maxLen = 0;

        while(right < s.length()) {
            char c = s.charAt(right);
            if(!hs.contains(c)) {
                hs.add(c);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}