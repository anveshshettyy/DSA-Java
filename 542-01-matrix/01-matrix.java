class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] vis = new int[row][col];
        int[][] res = new int[row][col];
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++){
                if(grid[i][j] == 0) {
                    q.add(new int[]{i, j});
                    vis[i][j] = 1;
                    res[i][j] = 0;
                }
            }
        }
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        while(!q.isEmpty()) {
                int[] idx = q.poll();
                int r = idx[0], c = idx[1];
                for(int i=0; i<4; i++) {
                    int nrow = idx[0] + dx[i];
                    int ncol = idx[1] + dy[i];
                    if(nrow>=0 && nrow<row && ncol>=0 && ncol<col && vis[nrow][ncol]==0) {
                        q.add(new int[]{nrow, ncol});
                        res[nrow][ncol] = res[r][c] + 1;
                        vis[nrow][ncol] = 1;
                    }
                }
        }   
        
        return res;
    }
}