class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0, maxProfit = 0;
        for(int i=1; i<prices.length; i++) {
            min = Math.min(prices[i], min);
            profit = prices[i] - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}