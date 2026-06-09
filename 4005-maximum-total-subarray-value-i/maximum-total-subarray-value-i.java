class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = nums[0], min = nums[0];
        for(int num: nums) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        return (max-min) * k;
    }
}