class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int j = 1;
        for(int i=1; i<nums.length; i++) {
            if(temp != nums[i]) {
                temp = nums[i];
                nums[j++] = temp;
            }
        }
        return j;
    }
}