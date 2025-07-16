class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // if(n==1 || m==1) return 0;
        if (grid[m - 1][n - 1] == 1)
            return 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = (grid[i][j] == 0) ? 1 : -1;
            }
        }

        for (int i = m - 2; i >= 0; i--) {
            if (grid[i][n - 1] == -1 || grid[i + 1][n - 1] == -1) {
                grid[i][n - 1] = -1;
            } else {
                grid[i][n - 1] = grid[i + 1][n - 1];
            }
        }

        for (int j = n - 2; j >= 0; j--) {
            if (grid[m - 1][j] == -1 || grid[m - 1][j + 1] == -1) {
                grid[m - 1][j] = -1;
            } else {
                grid[m - 1][j] = grid[m - 1][j + 1];
            }
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (grid[i][j] == -1) {
                    continue;
                }
                if (grid[i + 1][j] == -1) {
                    grid[i][j] = grid[i][j + 1];
                } else if (grid[i][j + 1] == -1) {
                    grid[i][j] = grid[i + 1][j];
                } else {
                    grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
                }
            }

        }

        return (grid[0][0] == -1) ? 0 : grid[0][0];
    }
}