class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for(int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if(c == ')' || c == ']' || c =='}') {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    if(stack.peek() == '(' && c == ')') stack.pop();
                    else if(stack.peek() == '{' && c == '}') stack.pop();
                    else if(stack.peek() == '[' && c == ']') stack.pop();
                     else {
                    return false;
                    }
                }
            }
        }
        return (stack.size() == 0) ? true : false;
    }
}