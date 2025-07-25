class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> heap = new PriorityQueue<>( (a, b) -> {
                int diff = (Math.abs(b-x) - Math.abs(a-x));
                if(diff == 0) return b-a;
                return diff;
        });

        for(int i:arr) {
            heap.add(i);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        ArrayList<Integer> res = new ArrayList<>(heap);
        Collections.sort(res);
        return res;
    }
}