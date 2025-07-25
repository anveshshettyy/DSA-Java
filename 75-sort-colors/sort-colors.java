class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i: nums) {
            minHeap.add(i);
        }

        for(int i=0; i<nums.length; i++) {
            nums[i] = minHeap.poll();
        }

    }
}