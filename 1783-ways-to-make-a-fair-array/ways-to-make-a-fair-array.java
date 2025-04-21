class Solution {
    public int waysToMakeFair(int[] nums) {
        int evenSum = 0, oddSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(i%2==0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }
        int count = 0;
        int prev = 0;
        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0) evenSum = evenSum - nums[i] + prev;
            else oddSum = oddSum - nums[i] + prev;

            if(evenSum == oddSum) count++;
            prev = nums[i];
        }
        return count;
    }
}