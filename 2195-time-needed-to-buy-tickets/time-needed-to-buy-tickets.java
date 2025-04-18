class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0, p1 = 0;
        while(tickets[k] != 0) {
            if(tickets[p1] != 0) {
                tickets[p1] -= 1;
                count++;
            }
            p1 = (p1 == tickets.length-1) ? 0 : ++p1;
        }
        return count;
    }
}