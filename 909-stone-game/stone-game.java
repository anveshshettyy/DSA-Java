class Solution {
    public boolean stoneGame(int[] piles) {
        int first = 0, last = piles.length -1;
        int alice = 0, bob = 0;
        while(first<=last) {
            alice += Math.max(piles[first], piles[last]);
            bob += Math.min(piles[first], piles[last]);
            first++;
            last--;
        }
        return alice > bob;
    }
}