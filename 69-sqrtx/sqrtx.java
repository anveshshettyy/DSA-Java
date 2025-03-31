class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        // if(x == 2147483647 ) return 46340;
        // for(int i=1; i <= x/2 + 1; i++) {
        //     if(i*i == x ) {
        //         return i;
        //     }
        //     if(i*i > x) {
        //         return i-1;
        //     }
        // }
        // return 1;

        int left = 0, right = x, res = 0;
        while(left<=right) {
            int mid = (left + right ) / 2;
            if(mid > x/mid) {
                right = mid - 1;
            } else if(mid < x / mid) {
                left = mid + 1;
                res = mid;
            } else return mid;
        }
        return res;
    }
}