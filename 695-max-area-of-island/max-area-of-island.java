class Solution {
    public int dfs(int i, int j, int n, int m, int[][] grid) {
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j] != 1) {
            return 0;
        }

        int count = 1;
        grid[i][j] = 0;

        count += dfs(i+1, j, n, m, grid);
        count += dfs(i-1, j, n, m, grid);
        count += dfs(i, j+1, n, m, grid);
        count += dfs(i, j-1, n, m, grid);

        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxCount = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 1) {
                    int count = dfs(i, j, n, m, grid);
                    maxCount = Math.max(count, maxCount);
                }
            }
        }

        return maxCount;
    }
}