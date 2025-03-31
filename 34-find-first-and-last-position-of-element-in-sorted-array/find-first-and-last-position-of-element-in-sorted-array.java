class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int res[] = {-1,-1};
        if(nums.length == 0) return res;

        while(left<=right) {
            if(nums[left] == target && nums[right] == target) {
                res[0] = left;
                res[1] = right;
                return res;
            }

            if(nums[left] == target) {
                right--;
            }
            else if(nums[right] == target) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        // int i=0;
        // for(i=0; i<nums.length; i++) {
        //     if(nums[i] == target) {
        //         res[0] = i;
        //         break;
        //     }
        // }
        // for(int j=nums.length-1; j>=i; j--) {
        //     if(nums[j] == target) {
        //         res[1] = j;
        //         break;
        //     }
        // }
        return res;
    }
}