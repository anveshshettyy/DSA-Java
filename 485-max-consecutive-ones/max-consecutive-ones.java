class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0, count = 0;
        for(int num: nums) {
            if(num == 1) count++;
            else {
                maxOnes = Math.max(maxOnes, count);
                count = 0;
            }
        }

        return count > maxOnes ? count : maxOnes;
    }
}