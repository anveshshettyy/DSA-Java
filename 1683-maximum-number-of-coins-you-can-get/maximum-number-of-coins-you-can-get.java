class Solution {
    public int maxCoins(int[] piles) {
        int i = 0, j = piles.length-1;
        int me = 0;
        Arrays.sort(piles);
        while(i<j) {
            int bob = piles[i++];
            int alice = piles[j--];
            me += piles[j--];
        }
        return me;
    }
}