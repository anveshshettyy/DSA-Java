class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                li.add(grid[i][j]);
            }
        }

        int size = li.size();
        k %= size;

        List<List<Integer>> res = new ArrayList<>();
        int a = 0;
        for(int i=0; i<n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<m; j++) {
                int index = (a - k + size) % size;
                temp.add(li.get(index));
                a++;
            }
            res.add(temp);
        }

        return res;
    }
}