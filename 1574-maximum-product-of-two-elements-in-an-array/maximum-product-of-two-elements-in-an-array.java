class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i:nums) {
            heap.add(i);
            if(heap.size() > 2) {
                heap.poll();
            } 
        }

        int a = heap.poll();
        int b = heap.poll();

        return ((a-1)*(b-1));
    }
}