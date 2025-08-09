class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        minPrice = 99999
        for i in range(0, len(prices)):
            minPrice = min(minPrice, prices[i])
            profit = prices[i] - minPrice
            maxProfit = max(profit, maxProfit)

        return maxProfit
        