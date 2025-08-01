class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                if(i-j == 0 || i+j == n-1) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
}