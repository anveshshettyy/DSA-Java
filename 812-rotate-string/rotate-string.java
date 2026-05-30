class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int n = s.length();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == goal.charAt(0)) {
                boolean matched = true;
                int k = i;
                for(int j=0; j<goal.length(); j++) {
                    if(s.charAt(k%n) != goal.charAt(j)) {
                        matched = false;
                        break;
                    }
                    k++;
                }
                if(matched) return true;
            }
        }
        return false;
    }
}