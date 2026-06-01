class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0, count = 0;
        for(int i=cost.length-1; i>=0; i--) {
            if(count == 2) {
                count = 0;
            } else {
                res += cost[i];
                count++;
            }
        }
        return res;
    }
}