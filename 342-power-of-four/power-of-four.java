class Solution {
    public boolean isPowerOfFour(int n) {
        for(long i=0; i*i<=n; i++) {
            if((long)Math.pow(4, i) == n) return true;
        }
        return false;
    }
}