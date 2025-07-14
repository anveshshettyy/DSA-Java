class Solution {
    public int subsetXORSum(int[] nums) {
        int or_all = 0;
        for(int i: nums) {
            or_all |= i;
        }
        return or_all * (1 << (nums.length-1));
    }
}