class Solution {
    public int colMax(int nums[][], int i) {
        int max = 0;
        for(int j=0; j<nums[0].length; j++) {
            max = Math.max(nums[i][j], max);
        }
        return max;
    }

    public int rowMax(int nums[][], int j) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            max = Math.max(nums[i][j], max);
        }
        return max;
    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int res[][] = new int[grid.length][grid[0].length];
        int colMax = 0, rowMax = 0;
        for(int i=0; i<grid.length; i++) {
            colMax = 0; rowMax = 0;
            for(int j=0; j<grid[0].length; j++) {
                colMax = colMax(grid, i);
                rowMax = rowMax(grid, j);
                res[i][j] = Math.min(rowMax, colMax);
            }
        }
        
        int sum = 0;
        for(int i=0; i<res.length; i++) {
            for(int j=0; j<res[0].length; j++) {
                System.out.print(res[i][j]+" ");
                sum += res[i][j] - grid[i][j];
            }
            System.out.println();
        }

        return sum;
    }
}