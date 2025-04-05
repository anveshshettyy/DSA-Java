class Solution {
    public int removeDuplicates(int[] nums) {
        int num = nums[0];
        int j = 1;
        for(int i=1; i<nums.length; i++) {
            if(num != nums[i]) {
                nums[j] = nums[i];
                num = nums[i]; 
                j++;
            }
        }
        return j;
    }
    
    
}