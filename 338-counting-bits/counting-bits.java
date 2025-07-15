class Solution {
    static {
        for(int i=0;i<400;i++){
            countBits(0);
        }
    }
    public static int[] countBits(int n) {
        int[] k=new int[n+1];
        for(int i=0;i<=n;i++){
            k[i]=k[i>>1] + (i&1);
        }
        return k;


    }
}