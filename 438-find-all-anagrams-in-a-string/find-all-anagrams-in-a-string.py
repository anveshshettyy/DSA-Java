class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        pArray = [0]*26
        sArray = [0]*26

        if len(s) < len(p):
            return []

        res = []

        for c in p:
            pArray[ord(c)-97]+=1

        k = len(p)

        

        for i in range(0, len(p)):
            sArray[ord(s[i]) - 97] += 1

        if sArray == pArray:
            res.append(0)

        for i in range(k, len(s)):
            sArray[ord(s[i])-97]+=1
            sArray[ord(s[i-k])-97]-=1
            if sArray == pArray:
                res.append(i-k+1)

        return res



        