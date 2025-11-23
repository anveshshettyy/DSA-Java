class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];

        int j = 0;
        for(int i=0; i<n; i++) {
            res[j] = nums[i];
            j+=2;
        }

        j=1;
        for(int i=n; i<nums.length; i++) {
            res[j] = nums[i];
            j+=2;
        }

        return res;
    }
}