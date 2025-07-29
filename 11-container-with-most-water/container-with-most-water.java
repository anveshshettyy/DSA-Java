class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0, minHeight = 0;
        int l = 0, r = height.length-1;
        while(l < r) {
            minHeight = Math.min(height[l], height[r]);
            int water = minHeight*(r-l);
            maxWater = Math.max(water, maxWater);
            if(minHeight == height[l]) l++;
            else r--;
        }
        return maxWater;
    }
}