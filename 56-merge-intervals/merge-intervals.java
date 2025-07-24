class Solution {
    public int[][] merge(int[][] intervals) {
        int m = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int res[][] = new int[m][2];

        int start = intervals[0][0];
        int end = intervals[0][1];
        int j = 0;
        for (int i = 1; i < m; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                res[j][0] = start;
                res[j][1] = end;
                j++;

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        res[j][0] = start;
        res[j][1] = end;
        j++;

        return Arrays.copyOf(res, j);
        
    }
}