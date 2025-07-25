class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums) {
            minHeap.add(i);
        }

        int res = 0;
        for(int i=0; i<k; i++) {
            res = minHeap.poll();
        }

        return res;
    }
}