class Solution {
    public String simplifyPath(String path) {
        String[] s = path.split("/");

        Stack <String> st = new Stack<String>();
        for(int i=0; i<s.length; i++) {
            if(s[i].equals("..")) {
                if(!st.isEmpty())
                    st.pop();
            } else if(s[i].equals(".") || s[i].equals("")) continue;
            else st.push(s[i]);
        }

        StringBuilder res = new StringBuilder();
        for(String dir : st) {
            res.append("/").append(dir);
        }
        return (res.length() != 0) ? res.toString() : "/";
    }
}