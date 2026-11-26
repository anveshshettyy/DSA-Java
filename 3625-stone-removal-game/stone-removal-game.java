class Solution {
    public boolean canAliceWin(int n) {
        for(int i=10; n>=0; i--) {
            if(i%2 != 0) {
                if(n<i) return true;
            }
            n -= i;
        }
        return false;
    }
}