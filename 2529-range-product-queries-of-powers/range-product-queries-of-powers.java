class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        final int MOD = 1_000_000_007;

        for (int bit = 0; n > 0; bit++) {
            if ((n & 1) == 1) {
                list.add(1 << bit);
            }
            n >>= 1;
        }

        int col = queries.length;
        int idx = 0;
        while (idx < col) {
            int result = 1;
            for (int i = queries[idx][0]; i <= queries[idx][1]; i++) {
                result = (int)((result * 1L * list.get(i)) % MOD);
            }
            res.add(result);
            idx++;
        }

        int resArray[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }

        return resArray;
    }
}