class Solution {
    public boolean checkString(String s) {
        int p1 = s.length()-2, p2 = s.length()-1;
        while(p1 >= 0) {
            if(s.charAt(p1) > s.charAt(p2)) return false;
            p1--; p2--;
        }
        return true;
    }
}