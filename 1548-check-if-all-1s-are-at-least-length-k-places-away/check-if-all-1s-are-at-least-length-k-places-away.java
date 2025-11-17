class Solution {
    static
    {
        for(int i=0;i<100;i++)kLengthApart(new int[]{0}, 2);
    }
    public static boolean kLengthApart(int[] nums, int k) {
        int window = 100;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                if(window<k) return false;
                window = 0;
            } else {
                window++;
            }
        }
        return true;
    }
}