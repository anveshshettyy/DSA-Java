class Solution {
    public int dfs(int[][] grid, int i, int j, int row, int col) {
        if(i<0 || i>row-1 || j<0 || j>col-1 || grid[i][j] != 1) return 0;

        int count = 1;
        grid[i][j] = 0;

        count += dfs(grid, i-1, j, row, col);
        count += dfs(grid, i+1, j, row, col);
        count += dfs(grid, i, j-1, row, col);
        count += dfs(grid, i, j+1, row, col);

        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length; 
        int col = grid[0].length;
        int maxCount = 0;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(grid[i][j] == 1) {
                    int count = dfs(grid, i, j, row, col);
                    maxCount = Math.max(count, maxCount);
                }
            }
        }

        return maxCount;
    }
}