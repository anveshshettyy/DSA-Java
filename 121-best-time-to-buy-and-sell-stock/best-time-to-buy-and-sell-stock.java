class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0], maxValue = 0, profit = 0, maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            profit = prices[i] - minValue;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}