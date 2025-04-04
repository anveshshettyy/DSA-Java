class Solution {
    public int search(int[] nums, int target) {

        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] == target) return i;
        // }
        // return -1;

        int left = 0, right = nums.length-1;
        while(left<=right) {
            int mid = (right+left) / 2;
            if(nums[mid] == target) return mid;

            if(nums[left] <= nums[mid]) {
                if(nums[left] <= target && nums[mid] >= target) 
                    right = mid - 1;
                else 
                    left = mid + 1;
            } else {
                if(nums[right] >= target && nums[mid] <= target) 
                    left = mid + 1;
                else 
                    right = mid - 1;
            }
        }
        return -1;
    }
}