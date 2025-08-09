class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        
        buy_price = prices[0]
        for cur_price in prices[1:]:
            if (cur_price - buy_price) > profit:
                profit = cur_price - buy_price
            elif cur_price < buy_price:
                buy_price = cur_price
        return profit