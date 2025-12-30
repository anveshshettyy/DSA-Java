class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0, tsum = 0, count = 0;
        for(int i: apple) {
            sum += i;
        }

        for(int i=capacity.length-1; i>=0; i--) {
            tsum += capacity[i];
            count++;
            if(tsum >= sum) {
                return count;
            }
        }
        return 0;
    }
}