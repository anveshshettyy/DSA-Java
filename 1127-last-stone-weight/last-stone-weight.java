class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap =  new PriorityQueue<>(Collections.reverseOrder());

        for(int i:stones) {
            maxHeap.add(i);
        }

        while(maxHeap.size() > 1) {
            int a1 = maxHeap.poll();
            int a2 = maxHeap.poll();

            if((a1-a2) > 0) {
                maxHeap.add(a1 - a2);
            } 
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}