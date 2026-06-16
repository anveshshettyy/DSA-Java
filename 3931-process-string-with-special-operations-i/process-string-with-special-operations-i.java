class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (res.length() > 0) {
                if (c == '*') {
                    res = res.deleteCharAt(res.length() - 1);
                } else if (c == '#') {
                    res.append(res);
                } else if (c == '%') {
                    res = res.reverse();
                }
            }
            if (c >= 'a' && c <= 'z')
                res.append(c);
        }
        return res.toString();
    }

}