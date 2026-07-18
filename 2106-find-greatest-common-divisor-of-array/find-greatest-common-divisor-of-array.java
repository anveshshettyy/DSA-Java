class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];

        for(int i=1; i<nums.length; i++) {
            smallest = Math.min(smallest, nums[i]);
            largest = Math.max(largest, nums[i]);
        }

        return gcd(smallest, largest);
    }

    private int gcd(int num1, int num2) {
        for(int i=num1; i>=0; i--) {
            if(num1%i == 0 && num2%i == 0) return i;
        }
        return 0;
    }
}