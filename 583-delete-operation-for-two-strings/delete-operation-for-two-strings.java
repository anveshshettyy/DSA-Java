class Solution {
    public int helper(String w1, String w2, int i, int j, int[][] dp) {
        if(i < 0 && j<0) return 0;
        if(i < 0 ) return j + 1;
        if(j < 0) return 1 + i;

        if(dp[i][j] != -1 ) return dp[i][j];

        if(w1.charAt(i) == w2.charAt(j)) {
            dp[i][j] = helper(w1, w2, i-1, j-1, dp);
        } else {
            dp[i][j] = 1 + Math.min(helper(w1, w2, i-1, j, dp), helper(w1, w2, i, j-1, dp));
        }

        return dp[i][j];

    }
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()][word2.length()];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }
        return helper(word1, word2, word1.length()-1, word2.length()-1, dp);
    }
}