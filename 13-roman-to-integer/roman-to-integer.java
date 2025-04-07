class Solution {
    public int romanToInt(String s) {
        int res = 0;
        // for(int i=0; i<s.length(); i++) {
        //     if(s.charAt(i) == 'I') res += 1;
        //     if(s.charAt(i) == 'V') {
        //         if(s.charAt(i-1) == 'I') res += 4;
        //         else  res += 5;
        //     } 
        //     if(s.charAt(i) == 'X') res += 10;
        //     if(s.charAt(i) == 'L') res += 50;
        //     if(s.charAt(i) == 'C') res += 100;
        //     if(s.charAt(i) == 'D') res += 500;
        //     if(s.charAt(i) == 'M') res += 1000;
        // }

        int i = 0;
        while(i < s.length()) {
            if(s.charAt(i) == 'I') {
                if(i+1 < s.length() &&  s.charAt(i+1) == 'V') {res += 4; i++;} 
                else if( i+1 < s.length() && s.charAt(i+1) == 'X') {res += 9; i++;}
                else res += 1;
            } 
            else if(s.charAt(i) == 'V') res += 5;
            else if(s.charAt(i) == 'X' ) {
                if( i+1 < s.length() &&s.charAt(i+1) == 'L') {res += 40; i++;} 
                else if(i+1 < s.length() && s.charAt(i+1) == 'C'  ) {res += 90; i++;}
                else res += 10;
            }
            else if(s.charAt(i) == 'L') res += 50;
            else if(s.charAt(i) == 'C') {
                if( i+1 < s.length() && s.charAt(i+1) == 'D'  ) {res += 400; i++;} 
                else if( i+1 < s.length() && s.charAt(i+1) == 'M' ) {res += 900; i++;}
                else res += 100;
            }
            else if(s.charAt(i) == 'D') res += 500;
            else if(s.charAt(i) == 'M') res += 1000;
            i++;
        }

        

        return res;
    }
}