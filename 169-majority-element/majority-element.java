class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length, count = 0, num = 0;
        for(int i: nums) {
            if(count == 0) num = i;
            if(num == i) count++;
            else count--;
        }
        return num;
    }
}