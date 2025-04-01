class Solution {
    static int mid(int nums[], int mid) {
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<mid; i++) 
            sum1 += nums[i];

        for(int i=mid+1; i<nums.length; i++) 
            sum2 += nums[i];
        
        return (sum1 == sum2) ? mid : -1;
    }
    public int pivotIndex(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(mid(nums, i) != -1) {
                return i;
            }
        }
        return -1;
    }
}