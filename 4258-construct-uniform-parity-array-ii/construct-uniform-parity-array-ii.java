class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE, oddCount = 0;
        for(int num: nums1) {
            min = Math.min(min, num);
            if(num % 2 != 0) oddCount++;
        }

        return min % 2 != 0 || oddCount == 0;
    }
}