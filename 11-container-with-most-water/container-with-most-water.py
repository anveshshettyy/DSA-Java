class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxWater = 0
        minHeight = 0

        l = 0
        r = len(height)-1

        while l < r:
            minHeight = min(height[l], height[r])
            water = minHeight * (r-l)
            maxWater = max(maxWater, water)
            if minHeight == height[l]:
                l+=1
            else:
                r-=1

        return maxWater
        