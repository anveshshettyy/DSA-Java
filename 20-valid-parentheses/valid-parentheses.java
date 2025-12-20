class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{') {
                st.push(ch[i]);
            } else {
                if(st.isEmpty()) return false;
                if(ch[i] == ')' && st.peek() != '(') {
                    return false;
                } else if(ch[i] == ']' && st.peek() != '[') {
                    return false;
                } else if(ch[i] == '}' && st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            }
        } 
        if(st.isEmpty()) {
            return true;
        } else {
        return false;
        }
        
    }
}