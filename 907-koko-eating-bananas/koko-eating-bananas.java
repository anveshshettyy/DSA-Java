class Solution {
    static int CalculateHrs(int arr[], int hr) {
        int totalHrs = 0;
        for(int i=0; i<arr.length; i++) {
            totalHrs += (int) Math.ceil((double) arr[i] / hr);
        }
        return totalHrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
       
        while(left<right) {
            int mid = left + (right - left) / 2;
            int totalHrs = CalculateHrs(piles, mid);
            if(totalHrs <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left; 
    }
}