class Solution {
    public int[][] flipAndInvertImage(int[][] a) {
        int c = a[0].length;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<(c+1)/2; j++) {
                int t=a[i][j] ^ 1;
                a[i][j]=a[i][c-1-j]^1;
                a[i][c-1-j]=t;
            }
        }
        return a;
    }
}