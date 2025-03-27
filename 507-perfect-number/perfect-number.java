class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=1, sum = 0;
        while(i<num) {
            if(num % i == 0) {
                sum += i;
            }   
            i++;
        }
        return (num == sum) ? true : false;
    }
}