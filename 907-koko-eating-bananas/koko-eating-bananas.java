class Solution {
    public int hoursToEat(int[] piles, int maxPile) {
        int k = 0;
        for(int pile: piles) {
            k += (pile + maxPile - 1) / maxPile;
        }
        return k;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for(int pile: piles) {
            maxPile = Math.max(pile, maxPile);
        }

        if(piles.length == h) return maxPile;
        int left = 1, right = maxPile;
        while(left < right) {
            int mid = left + (right - left) / 2;
            int hrs = hoursToEat(piles, mid);
            if(hrs <= h) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }
}