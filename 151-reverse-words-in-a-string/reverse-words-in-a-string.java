class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = str.length-1;
        for(int i=n; i>=0; i--) {
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}