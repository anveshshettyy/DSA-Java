class Solution {
    public int maxDepth(String s) {
        int count = 0, maxCount = 0;
        for(char c: s.toCharArray()) {
            if(c == '(') count++;
            else if (c == ')') count--;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}