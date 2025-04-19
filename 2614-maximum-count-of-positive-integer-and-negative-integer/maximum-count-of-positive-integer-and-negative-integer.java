class Solution {
    int count(int nums[] , int start, int end, int i) {
        if(i >= nums.length) return 0;
        int res = 0;
        if(nums[i] > start && nums[i] < end) {
            res++;
        }
        return res + count(nums, start, end, ++i); 
    }
    public int maximumCount(int[] nums) {
        int count1 = count(nums, Integer.MIN_VALUE, 0, 0);
        int count2 = count(nums, 0, Integer.MAX_VALUE, 0);
        return Math.max(count1, count2);
    }
}