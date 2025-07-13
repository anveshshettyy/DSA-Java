class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0, sum = 0;
        for(int i=0; i<accounts.length; i++) {
            for(int j=0; j<accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            maxSum = Math.max(sum, maxSum);
            sum = 0;
        }

        return maxSum;
    }
}