class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length, m = colSum.length;
        int matrix[][] = new int[n][m];
        
        
        for(int i=0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<m; j++) {
                min = Math.min(rowSum[i], colSum[j]);
                matrix[i][j] = min;
                rowSum[i] -= min;
                colSum[j] -= min;
            }
            
        }

        return matrix;
    }
}