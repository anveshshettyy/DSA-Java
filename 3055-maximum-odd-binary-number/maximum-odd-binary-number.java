class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder res = new StringBuilder();
        int countOnes = 0;
        for(char c:s.toCharArray()) 
            if(c == '1') countOnes++;

        for(int i=0; i<s.length()-1; i++) 
            res.append((countOnes-- > 1) ? "1" : "0");
            
        res.append('1');
        return res.toString();
    }
}