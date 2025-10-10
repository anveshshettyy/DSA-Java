class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split("\\s+");
        for(int i=strs.length-1; i>=0; i--) {
            sb.append(strs[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}