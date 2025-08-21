class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];

        int max = 0;
        for(int i=m-1; i>=0; i--) {
            dp[i][n-1] = matrix[i][n-1] - '0';
            max = Math.max(max, dp[i][n - 1]); 
        }

        for(int j=n-1; j>=0; j--) {
            dp[m-1][j] = matrix[m-1][j] - '0';
            max = Math.max(max, dp[m-1][j]); 
        }
            

        for(int i=m-2; i>=0; i--) {
            for(int j=n-2; j>=0; j--) {
                if(matrix[i][j] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i][j+1], Math.min(dp[i+1][j+1], dp[i+1][j]));
                } else {
                    dp[i][j] = 0;
                }
                
                max = Math.max(max, dp[i][j]);
            }
        }

        return max*max;
    }
}