class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        int left = 0, right = str.length-1;
        while(left < right) {
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            right--; left++;
        }
        s = "";
        for(String ss:str) {
            s+= ss;
            s += " ";
        } 
        return s.trim();
    }
}