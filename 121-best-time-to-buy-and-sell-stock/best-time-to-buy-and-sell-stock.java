class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice = prices[0];

        for(int i=1; i<prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}