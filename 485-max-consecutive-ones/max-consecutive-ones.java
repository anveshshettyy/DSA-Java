class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for(int i=0; i<nums.length; i++) {
            count = (nums[i] == 0) ? 0 : ++count;
            if(count > maxCount) maxCount = count;
        }
        return maxCount;
    }
}