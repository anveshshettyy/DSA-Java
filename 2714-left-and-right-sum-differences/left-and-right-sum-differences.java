class Solution {
    public int[] leftRightDifference(int[] nums) {
        int diff[] = new int[nums.length];
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        for(int i=0; i<nums.length; i++) {
            int leftSum = 0, rightSum = 0;
            for(int j=0; j<=i; j++) {
                if(j<i) {
                    leftSum += nums[j];
                }
            }
            rightSum = sum - leftSum - nums[i];
            diff[i] = Math.abs(leftSum - rightSum);
        }
        return diff;
    }
}