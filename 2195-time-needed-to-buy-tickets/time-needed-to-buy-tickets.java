class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0, p1 = 0;
        while(tickets[k] != 0) {
            if(tickets[p1] != 0) {
                tickets[p1] -= 1;
                count++;
            }
            p1++;
            // if(tickets[k] == 0) break;
            if(p1 == tickets.length) p1 = 0;
        }
        return count;
    }
}