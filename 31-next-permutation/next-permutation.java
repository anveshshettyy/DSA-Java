class Solution {
    static void Reverse(int nums[], int i, int j) {
        while(i<j) Swap(nums, i++, j--);
    }
    static void Swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int i=nums.length - 2;
        while(i>=0 && nums[i] >= nums[i+1]) i--;

        if(i>=0) {
            int j = nums.length-1;
            while(nums[j] <= nums[i]) j--;
            Swap(nums, i, j);
        }
        Reverse(nums, i+1, nums.length-1);

    }
}