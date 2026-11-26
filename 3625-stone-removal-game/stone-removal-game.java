class Solution {
    public boolean canAliceWin(int n) {
        int res = 0;
        for(int i=10; n>=0; i--) {
            System.out.println(n);
            if(i%2 != 0) {
                if(n<i) return true;
            }
            n -= i;
        }
        return false;
    }
}