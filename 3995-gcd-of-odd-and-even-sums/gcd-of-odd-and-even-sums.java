class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n*n, evenSum = n*(n+1);
        return findGCD(oddSum, evenSum);
    }

    public int findGCD(int a, int b) {
        for(int i=b/2; i>=0; i--) {
            if((a%i == 0) && (b%i == 0)) return i;
        }
        return 0;
    }
}