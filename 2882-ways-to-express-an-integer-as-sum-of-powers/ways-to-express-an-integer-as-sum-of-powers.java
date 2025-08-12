class Solution {
    static final int MOD = 1_000_000_007;
    public int fun(ArrayList<Integer> list, int n, int pos, int sum, int[][] dp) {
        if(sum == n) return 1;
        if (sum > n || pos >= list.size()) return 0;

        if(dp[pos][sum] != -1) return dp[pos][sum];
        
        int include = fun(list, n, pos+1, sum+list.get(pos), dp);
        int exclude = fun(list, n, pos+1, sum, dp);
        return dp[pos][sum] = (int)(((long)include + exclude) % MOD);
    }
    public int numberOfWays(int n, int x) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; Math.pow(i, x)<=n; i++) {
            list.add((int)Math.pow(i, x));
        }

        int dp[][] = new int[list.size()][n+1];
        for(int[] i: dp) Arrays.fill(i, -1);

        return fun(list, n, 0, 0, dp);
    }
}