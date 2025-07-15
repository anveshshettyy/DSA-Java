class Solution {
    public int countPaths(int top, int down, int m, int n, int dp[][]) {
        if(top >= m || down >= n) return 0;
        if(top == m-1 && down == n-1 ) return 1;
        if(dp[top][down] != 0) return dp[top][down];
        dp[top][down] = countPaths(top+1, down, m, n, dp) + countPaths(top, down+1, m, n, dp);
        return dp[top][down];
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return countPaths(0, 0, m, n, dp);
    }
}