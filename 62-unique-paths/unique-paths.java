class Solution {
    public int uniquePaths(int m, int n) {
        // int m = 3, n = 2;

        if(m==1 || n==1) return 1;

        int grid[][] = new int[m][n];

        for (int j = 0; j < n; j++) {
            grid[m - 1][j] = 1;
        }

        for (int j = 0; j < m; j++) {
            grid[j][n - 1] = 1;
        }

        // grid[m-2][n-1] = 1;

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                grid[i][j] = grid[i+1][j] + grid[i][j + 1];
            }
        }

        int sum = grid[0][1] + grid[1][0];

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(grid[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        return sum;
    }
}