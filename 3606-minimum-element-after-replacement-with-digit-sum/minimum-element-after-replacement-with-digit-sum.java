class Solution {
    public int minElement(int[] nums) {
        int min = nums[0];
        for(int num: nums) {
            min = Math.min(min, sum(num));
        }
        return min;
    }
    public int sum(int num) {
        int total = 0;
        while(num>0) {
            total += num%10;
            num /= 10;
        }
        return total;
    }
}