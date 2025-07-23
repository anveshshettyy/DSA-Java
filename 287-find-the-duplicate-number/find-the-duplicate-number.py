class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        dp = [0]*len(nums)
        for i in range(0, len(nums)):
            if dp[nums[i]] == -1:
                return nums[i]

            dp[nums[i]] = -1
            
