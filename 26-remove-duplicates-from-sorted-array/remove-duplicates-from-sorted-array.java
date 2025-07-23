class Solution {
    public int removeDuplicates(int[] nums) {
        int num = nums[0], count = 1;
        int j = 1;
        for(int i=0; i<nums.length; i++) {
            if(num != nums[i]) {
                count++;
                num = nums[i];
                nums[j++] = num;
            }
        }

        return count;
    }
}