class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0, min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = prices[i] - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}