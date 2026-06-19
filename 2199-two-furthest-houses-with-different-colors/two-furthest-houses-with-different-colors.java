class Solution {
    public int maxDistance(int[] colors) {
        int i = 0, j = colors.length-1;
        int dis1 = 0, dis2 = 0;
        while(i<j) {
            if(colors[i] != colors[j]) {
                dis1 = Math.abs(i-j);
                break;
            }
            j--;
        }
        i = 0; j = colors.length-1;
        while(i<j) {
            if(colors[i] != colors[j]) {
                dis2 = Math.abs(i-j);
                break;
            }
            i++;
        }
        return Math.max(dis1, dis2);
    }
}