class Solution {
    public void flipRow(int[][] grid, int row) {
        for (int j = 0; j < grid[0].length; j++) {
            grid[row][j] = grid[row][j] == 0 ? 1 : 0;
        }
    }

    public void flipCol(int[][] grid, int col) {
        for (int j = 0; j < grid.length; j++) {
            grid[j][col] = grid[j][col] == 0 ? 1 : 0;
        }
    }

    public int matrixScore(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                flipRow(grid, i);
            }
        }

        for (int j = 0; j < grid[0].length; j++) {
            int zeroCount = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 0)
                    zeroCount++;
            }
            if (zeroCount > grid.length / 2) {
                flipCol(grid, j);
            }
        }

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            StringBuilder binary = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                binary.append(grid[i][j]);
            }
            sum += Integer.parseInt(binary.toString(), 2);
        }

        return sum;
    }
}