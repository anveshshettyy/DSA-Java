class Solution {
    public int uniquePaths(int m, int n) {
        // int m = 3, n = 2;

        if (m == 1 || n == 1)
            return 1;
        int grid[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], 1);
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
            }
        }

        return grid[0][0];

    }
}