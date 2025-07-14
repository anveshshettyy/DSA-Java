class Solution {
    public void setZero(int[][] matrix, int row, int col) { 
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(i==row && matrix[i][j]!=0) {
                    matrix[i][j] = 6969;
                }

                if(j==col && matrix[i][j]!=0) {
                    matrix[i][j] = 6969;
                }
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    setZero(matrix, i, j);
                }
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 6969) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}