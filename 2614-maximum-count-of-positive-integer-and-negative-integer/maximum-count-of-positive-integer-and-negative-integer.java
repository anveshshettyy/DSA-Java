class Solution {
    public int maximumCount(int[] nums) {
        int count1 = 0, count2 = 0;
        for(int i:nums) {
            if(i > 0) count1++;
            else if(i<0) count2++;
        }
        return Math.max(count1, count2);
    }
}