class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
            reverse(grid[i]); 
        }

        int sum = 0;
        for (int j = 0; j < n; j++) {
            int max = 0;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, grid[i][j]);
            }
            sum += max;
        }

        return sum;
    }

    private void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    
}
