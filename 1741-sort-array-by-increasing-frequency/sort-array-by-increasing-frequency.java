
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> {
                int fa = map.get(a);
                int fb = map.get(b);
                if(fa == fb) return b - a;
                return fa - fb;
            }
        );

        for(int i: map.keySet()) {
            minHeap.add(i);
        }

        int j=0;
        while(!minHeap.isEmpty()) {
            int num = minHeap.poll();
            for(int i=0; i<map.get(num); i++) {
                nums[j] = num;
                j++;
            }
        }

        return nums;
    }
}
