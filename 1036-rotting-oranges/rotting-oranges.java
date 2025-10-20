class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int cntOnes = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    cntOnes++;
                }
            }
        }

        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };

        int time = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            boolean newrot = false;
            for (int s = 0; s < size; s++) {
                int[] idx = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nrow = idx[0] + dx[i];
                    int ncol = idx[1] + dy[i];
                    if (nrow >= 0 && nrow < row && ncol >= 0 && ncol < col && grid[nrow][ncol] == 1) {
                        q.add(new int[] { nrow, ncol });
                        grid[nrow][ncol] = 2;
                        newrot = true;
                        cntOnes--;
                    }
                }
            }
            if (newrot) time++;
        }

        return (cntOnes == 0) ? time : -1;
    }
}