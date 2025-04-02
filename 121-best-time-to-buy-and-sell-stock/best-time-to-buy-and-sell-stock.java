class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = 0, maxProfit = 0;
        for(int i:prices) {
            min = Math.min(min, i);
            profit = i - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}