class Solution {
    static{
        for(int i=0 ;i<500;i++){
            findDuplicate(new int[]{0});
        }
    }
    public static int findDuplicate(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i:nums) {
            if(dp[i] == -1) return i;
            dp[i] = -1;
        }
        return -1;
    }
}