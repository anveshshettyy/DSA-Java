class Solution {
    public int rob(int[] nums) {
        int a = 0, b = 0;
        for(int i = 0; i < nums.length; i++) {
            int maxLoot = Math.max((nums[i] + a), b);
            a = b;
            b = maxLoot;
        }
        return b;
    }
}