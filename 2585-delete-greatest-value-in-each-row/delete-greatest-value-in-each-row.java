class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                list.add(grid[i][j]);
            }
            Collections.sort(list);
            int k = 0;
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = list.get(k++);
            }
        }

        int sum = 0;
        for(int i=0; i<grid[0].length; i++) {
            int max = 0;
            for(int j=0; j<grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            sum += max;
        }

        return sum;
    }
}