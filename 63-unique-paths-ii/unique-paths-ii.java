class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                grid[i][j] = grid[i][j] == 0 ? 1 : 0;
            }
        }

        int flag = 1;
        for(int i=0; i<m; i++) {
            if(grid[i][0] == 0) flag = 0;
            grid[i][0] = flag;
        }

        flag = 1;
        for(int i=0; i<n; i++) {
            if(grid[0][i] == 0) flag = 0;
            grid[0][i] = flag;
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(grid[i][j] != 0)
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }

        return grid[m-1][n-1];
    }
}