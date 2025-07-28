class Solution {
    public void reverse(int i, int j, int[] nums) {
        while(i < j) {
            swap(i, j, nums);
            i++; j--;
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;

        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }

        if(i>=0) {
            int j = n-1;
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(i, j, nums);
        }
        reverse(i+1, n-1, nums);
    }
}