class Solution {
    public boolean checkDivisibility(int n) {
        if(n < 10) return false;
        int sum = 0, prod = 1, temp = n;
        while(temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            sum += rem;
            prod *= rem;
        }
        return n % (sum+prod) == 0;
    }
}