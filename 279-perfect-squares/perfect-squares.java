class Solution {
    public int square(int dp[], int n) {
        if(n==0) return 0;
        if(dp[n] != -1) {
            return dp[n];
        }

        int ans = Integer.MAX_VALUE;
        for(int i=1; i*i <=n; i++) {
            ans = Math.min(ans, square(dp, n-(i*i)));
        }

        dp[n] = ans + 1;
        return dp[n];
    }
    public int numSquares(int n) {
       int dp[] = new int[n+1];
       Arrays.fill(dp, -1);

       dp[0] = 0;
       dp[1] = 1;

        return square(dp, n);
    }
}