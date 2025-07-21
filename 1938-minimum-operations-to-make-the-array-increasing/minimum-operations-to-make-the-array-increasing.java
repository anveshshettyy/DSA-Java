class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        for(int i=1; i<nums.length; i++) {
            int min = nums[i] - nums[i-1];
            if(min <= 0) {
                res += Math.abs(min) + 1;
                nums[i] += Math.abs(min) + 1;
            }
        }
        return res;
    }
}