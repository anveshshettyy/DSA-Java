class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, num = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(count == 0) num = nums[i];
            if(num == nums[i]) count += 1;
            else count -= 1;
        }
        return num;
    }
}