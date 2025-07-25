class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums) {
            heap.add(i);
        }

        int a = heap.poll();
        int b = heap.poll();

        return ((a-1)*(b-1));
    }
}