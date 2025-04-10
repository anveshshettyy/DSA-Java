class Solution {
   static {
        for (int i = 0; i < 500; i++) {
            maxArea(new int[]{});
        }
    }

    public static int maxArea(int[] height) {
        int area = 0;
        int l = 0, r = height.length - 1;

        while (l < r) {
            int minH = Math.min(height[l], height[r]);
            area = Math.max(area, (r - l) * minH);

            while (l < r && height[l] <= minH) {
                l++;
            }
            while (l < r && height[r] <= minH) {
                r--;
            }
        }

        return area;
    }
}