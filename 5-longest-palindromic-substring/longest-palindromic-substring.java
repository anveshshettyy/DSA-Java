class Solution {
    public String longestPalindrome(String s) {
        int resLen = 0;
        String res = "";

        for(int i=0; i<s.length(); i++) {
            int l = i, r = i;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if(len > resLen) {
                    res = s.substring(l, r+1);
                    resLen = len;
                }
                r++; l--;
            }

            l = i; r = i+1;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if(len > resLen) {
                    res = s.substring(l, r+1);
                    resLen = len;
                }
                r++; l--;
            }
        }
        return res;
    }
}