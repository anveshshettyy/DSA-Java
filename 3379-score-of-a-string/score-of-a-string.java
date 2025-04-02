class Solution {
    public int scoreOfString(String s) {
        int len = s.length();
        int sum = 0;
        char c1 = '1';
        char c2 = '1';
        for(int i=0; i < len-1; i++) {
            c1 = s.charAt(i);
            c2 = s.charAt(i+1);
            sum += Math.abs(c1 - c2);
        }
        return sum;
    }
}