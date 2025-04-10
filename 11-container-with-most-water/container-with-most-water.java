class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int currSum = 0, maxSum = 0;
        while(left < right) {
            currSum = Math.min(height[left], height[right]) * (right - left);
            maxSum = Math.max(currSum, maxSum);
            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxSum;
    }
}