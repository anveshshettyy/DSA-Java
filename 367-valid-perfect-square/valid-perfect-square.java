class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        // if(num == 100000001) return false;

        // for(int i=0; i<= num /2; i++) {
        //     if(i*i == num) {
        //         return true;
        //     }
        // }
        // return false;

        int left = 2, right = num / 2, res = 0;
        while(left<=right) {
            int mid = (right + left) / 2;
            long square =(long) mid * mid;
            if(square == num) 
                return true;
            else if(square > num) 
                right = mid - 1;
            else 
                left = mid + 1;
        }
        return false;
    }
}