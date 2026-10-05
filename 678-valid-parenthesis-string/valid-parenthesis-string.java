class Solution {
    public boolean checkValidString(String s) {
        int openMin = 0;
        int openMax = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                openMin++;
                openMax++;
            } 
            else if (c == ')') {
                openMin--;
                openMax--;
            } 
            else { 
                openMin--;
                openMax++;
            }

            openMin = Math.max(0, openMin);

            if (openMax < 0) {
                return false;
            }
        }

        return openMin == 0;
    }
}