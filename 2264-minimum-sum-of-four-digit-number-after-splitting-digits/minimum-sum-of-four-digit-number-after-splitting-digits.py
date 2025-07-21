class Solution:
    def minimumSum(self, num: int) -> int:
        i = 0
        nums = [0] * 4
        while num > 0:
            nums[i] = num % 10
            num //= 10
            i += 1
        
        nums.sort()
        num1 = nums[0]*10 + nums[2]
        num2 = nums[1]*10 + nums[3]

        return num1 + num2

        