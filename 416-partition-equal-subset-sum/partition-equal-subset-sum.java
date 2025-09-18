class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0, target = 0;
        for(int num: nums) sum += num;
        if(sum % 2 != 0) return false;
        target = sum / 2;

        boolean dp[] = new boolean[target+1];
        dp[0] = true;
        for(int num: nums) {
            for(int s = target; s >= num; s--) {
                if(dp[s - num]) dp[s] = true;
            }
        }

        return dp[target];
    }
}