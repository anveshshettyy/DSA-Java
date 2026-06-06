class Solution {
    public int[] leftRightDifference(int[] nums) {
        int diff[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int leftSum = 0, rightSum = 0;
            for(int j=0; j<nums.length; j++) {
                if(j<i) {
                    leftSum += nums[j];
                } else if(j>i) {
                    rightSum += nums[j];
                }
            }
            diff[i] = Math.abs(leftSum - rightSum);
        }
        return diff;
    }
}