class Solution {
    public int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                maxCount = Math.max(maxCount, open * 2);
            } else if (close > open) {
                open = 0;
                close = 0;
            }
        }

        open = 0;
        close = 0;

        // Right -> Left
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ')') {
                close++;
            } else {
                open++;
            }

            if (open == close) {
                maxCount = Math.max(maxCount, open * 2);
            } else if (open > close) {
                open = 0;
                close = 0;
            }
        }

        return maxCount;
    }
}