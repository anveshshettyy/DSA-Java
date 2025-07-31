class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c=='I') sum += 1;
            
            else if(c=='V'){
                sum += (i>0 && s.charAt(i-1) == 'I') ? 3 : 5;
            } 
            else if(c=='X') {
                sum += (i>0 && s.charAt(i-1) == 'I') ? 8 : 10;
            } 
            else if(c=='L') {
                sum += (i>0 && s.charAt(i-1) == 'X') ? 30 : 50;
            }
            else if(c=='C') {
                sum += (i>0 && s.charAt(i-1) == 'X') ? 80 : 100;
            }
            else if(c=='D') {
                sum += (i>0 && s.charAt(i-1) == 'C') ? 300 : 500;
            } 
            else if(c=='M') {
                sum += (i>0 && s.charAt(i-1) == 'C') ? 800 : 1000;
            } 
        }

        return sum;
    }
}