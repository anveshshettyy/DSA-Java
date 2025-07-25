class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(a);
        maxHeap.add(b);
        maxHeap.add(c);

        int count = 0;
        while(true) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if(second == 0) {
                break;
            }

            first--;
            second--;
            count++;

            maxHeap.add(first);
            maxHeap.add(second);
        }

        return count;
    } 
}