class Solution {
    public int helper(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        if(i == triangle.size()-1) {
            return triangle.get(i).get(j);
        }

        if(dp[i][j] != -1) return dp[i][j];

        int sum1 = triangle.get(i).get(j) + helper(triangle, i+1, j, dp);
        int sum2 = triangle.get(i).get(j) + helper(triangle, i+1, j+1, dp);

        dp[i][j] = Math.min(sum1, sum2);
        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(triangle, 0, 0, dp);       
    }
}