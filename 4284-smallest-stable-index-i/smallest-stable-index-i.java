class Solution {
    public int firstStableIndex(int[] nums, int l) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, res = 0;
        for(int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = nums[i];
            for(int j=i; j<nums.length; j++) {
                min = Math.min(nums[j], min);
            }
            if ((max-min) <= l) {
                return i;
            }
        }
        return -1;
    }
}