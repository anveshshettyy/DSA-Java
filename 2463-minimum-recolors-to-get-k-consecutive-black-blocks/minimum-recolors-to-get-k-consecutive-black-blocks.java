class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minRecolor = Integer.MAX_VALUE;
        for(int i=0; i<=blocks.length() - k; i++) {
            int white = 0;

            for(int j=i; j<i+k; j++) {
                if(blocks.charAt(j) == 'W') {
                    white++;
                }
            }

            minRecolor = Math.min(minRecolor, white);
        }

        return minRecolor;
    }
}