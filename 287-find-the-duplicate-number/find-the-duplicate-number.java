class Solution {
    public int findDuplicate(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i:nums) {
            if(dp[i] == -1) return i;
            dp[i] = -1;
        }
        return -1;
    }
}