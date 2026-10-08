class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0, close = 0;
        for(char c: s.toCharArray()) {
            if(c == '(') {
                open++;
                if(open > 1) {
                    sb.append('(');
                }
            } else {
                open--;
                if(open>0) {
                    sb.append(')');
                }
            }
            
        }
        return sb.toString();
    }
}