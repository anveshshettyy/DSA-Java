class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int p1 = 0, p2 = 1, res = 0;
        while(p2<=nums.length-1) {
            int diff = nums[p2] - nums[p1];
            if(diff == 1) res = Math.max(res, p2-p1+1);
            if(diff<=1) p2++;
            else p1++;  
        }
        return res;
    }
}