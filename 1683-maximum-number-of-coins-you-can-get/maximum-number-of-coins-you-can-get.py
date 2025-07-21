class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        i = 0
        j = len(piles)-1
        piles.sort()
        me = 0
        while i < j:
            bob = piles[i]
            alice = piles[j]
            j-=1
            me += piles[j]
            i+=1
            j-=1
        return me

        