class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(i);
            }
            else if(c == ')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    sb.setCharAt(i, '*');
                }
            }
        }

        while(!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*');
        }


        StringBuilder res = new StringBuilder();
        for(int i=0; i<sb.length(); i++) {
            char c = sb.charAt(i);
            if(c != '*') {
                res.append(c);
            }
        }

        return res.toString();
    }
}