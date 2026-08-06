class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<Integer.MAX_VALUE; i++) {
            if(isDivisible(i, t)) return i;
        }
        return -1;
    }

    public boolean isDivisible(int i, int t) {
        int prod = 1;
        while(i>0) {
            int rem = i % 10;
            i /= 10;
            prod *= rem;
        }
        return (prod % t == 0);
    }
}