class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        map = {}
        map[0] = 1
        sum = 0
        count = 0
        for n in nums:
            sum += n
            if sum-k in map:
                count += map.get(sum-k, 0)

            map[sum] = map.get(sum, 0)+1

        return count




