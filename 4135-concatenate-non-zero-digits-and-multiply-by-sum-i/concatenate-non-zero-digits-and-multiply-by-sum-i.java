class Solution {
    public long sumAndMultiply(int n) {
        int temp = n;
        long sum = 0, res = 0, mul = 1;
        while(temp>0) {
            int rem = temp % 10;
            if(rem != 0) {
                res = (rem * mul) + res;
                mul *= 10;
                sum += rem;
            }
            temp /= 10;
        }
        return res*sum;
    }
}