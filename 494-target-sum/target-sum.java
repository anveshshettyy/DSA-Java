class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        if ((target + total) % 2 != 0 || target > total || target < -total) {
            return 0;
        }

        int sum = (target + total) / 2;
        int n = nums.length;
        int dp[][] = new int[n+1][sum+1];

        for(int i=0; i<n+1; i++) {
            dp[i][0] = 1;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=0; j<sum+1; j++) {
                if(nums[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
            }
        }

        return dp[n][sum];


    }
}