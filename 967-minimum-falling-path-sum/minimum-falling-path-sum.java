class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for(int i=1; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(j==0) {
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                }
                else if(j == n-1) {
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j-1]);
                } 
                else {
                    matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i-1][j+1]));
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for(int j=0; j<n; j++) {
            min = Math.min(min, matrix[m-1][j]);
        }
        return min;
    }
}