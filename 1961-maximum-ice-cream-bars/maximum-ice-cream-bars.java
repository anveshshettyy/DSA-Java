class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for (int cost : costs) {
            max = Math.max(max, cost);
        }

        int freq[] = new int[max + 1];

        for (int cost : costs) {
            freq[cost] += 1;
        }

        int res = 0;
        for (int i = 0; i <= max; i++) {
            if (coins < 0)
                break;
            while (freq[i] > 0 && coins >= i) {
                coins -= i;
                freq[i]--;
                res++;
            }
        }
        return res;
    }
}