class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length, sum = 0, rep = 0;
        int mul = n*n;
        int tsum = (mul * (mul+1)) / 2;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(set.contains(grid[i][j])) {
                    rep = grid[i][j];
                }
                set.add(grid[i][j]);
                sum += grid[i][j];
            }
        }

        return new int[]{rep, (rep + tsum - sum)};
    }
}