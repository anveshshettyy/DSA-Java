class Solution:
    def balancedStringSplit(self, s: str) -> int:
        res = 0
        count = 0
        for i in range(0, len(s)):
            if s[i] == 'R':
                count += 1
            else:
                count -= 1
            if count == 0:
                res += 1
        return res
        