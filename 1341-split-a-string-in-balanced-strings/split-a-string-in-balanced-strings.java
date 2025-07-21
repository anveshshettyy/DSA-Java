class Solution {
    public int balancedStringSplit(String s) {
        int res = 0, count = 0;
        for(char c:s.toCharArray()) {
            count = (c=='R') ? count + 1 : count - 1;
            if(count == 0) res++;
        }
        return res;
    }
}