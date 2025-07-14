class Solution {
    int sum = 0;
    public void subset(int[] nums, int curr, int pos) {
        if(pos == nums.length) {
            sum += curr;
            return;
        }
        subset(nums, (curr ^ nums[pos]), pos+1);
        subset(nums, curr, pos+1);
    }
    public int subsetXORSum(int[] nums) {
        subset(nums, 0, 0);
        return sum;
    }
}