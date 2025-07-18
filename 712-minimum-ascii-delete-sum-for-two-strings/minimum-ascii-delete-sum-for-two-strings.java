class Solution {
    static {
        for (int i = 0; i < 500; i++)
            minimumDeleteSum("a", "b");
    }
    public static int helper(String s1, String s2, int i, int j, int dp[][]) {
        if (i < 0 && j < 0) {
            return 0;
        }
        if (i < 0) {
            int sum = 0;
            for (int k = 0; k <= j; k++) {
                sum += s2.charAt(k);
            }
            return sum;
        } else if (j < 0) {
            int sum = 0;
            for (int k = 0; k <= i; k++) {
                sum += s1.charAt(k);
            }
            return sum;
        }

        if(dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = helper(s1, s2, i - 1, j - 1, dp);
        } else {
            int deleteS1 = s1.charAt(i) + helper(s1, s2, i - 1, j, dp);
            int deleteS2 = s2.charAt(j) + helper(s1, s2, i, j - 1, dp);
            dp[i][j] = Math.min(deleteS1, deleteS2);
        }
        return dp[i][j];
    }

    public static int minimumDeleteSum(String s1, String s2) {
        int dp[][] = new int[s1.length()][s2.length()];
        for(int[] rows: dp) {
            Arrays.fill(rows, -1);
        }
        return helper(s1, s2, s1.length() - 1, s2.length() - 1, dp);
    }
}