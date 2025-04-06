class Solution {
    public int reverse(int x) {
        int temp = x;
        if(x < 0) {
            x = -1 * x;
        }
        int rem, y = 0;
        while(x > 0) {
            rem = x % 10;
            x = x / 10;

            if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; 
            }
            y = y * 10 + rem;
        }
        return (temp < 0) ? y = -1 * y : y ;
    }
}