class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
        for(char c:s.toCharArray()) {
            if(c == '1') countOnes++;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length()-1; i++) {
            if(countOnes-- > 1) {
                res.append('1');
            } else {
                res.append('0');
            }
        }
        res.append('1');
        return res.toString();
    }
}