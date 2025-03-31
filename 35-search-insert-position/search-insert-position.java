class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1, pos = 0;
        while(left<=right) {
            int mid = (right + left) / 2;
            if(nums[mid] == target) 
                return mid;
            if(nums[mid] < target) {
                left = mid + 1;
                pos = left;
            } else right = mid - 1;  
        }
        return pos;
    }
}