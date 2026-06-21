class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0, res = 0;
        Arrays.sort(costs);
        for(int cost: costs) {
            if(cost <= coins) {
                coins -= cost;
                res++;
            }
        }
        return res;
    }
}