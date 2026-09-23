class Solution {
    public int reverseDegree(String s) {
        int rev = 0, idx = 1, sum = 0;
        for(char ch: s.toCharArray()) {
            rev =  26 - (ch - 'a'); 
            sum += rev  * idx++;
        }
        return sum;
    }
}