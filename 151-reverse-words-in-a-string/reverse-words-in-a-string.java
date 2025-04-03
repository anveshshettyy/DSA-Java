class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        int left = 0, right = str.length-1;
        s = "";
        for(int i=right; i>=0; i--) {
            s += str[i];
            s += " ";
        }
        return s.trim();
    }
}