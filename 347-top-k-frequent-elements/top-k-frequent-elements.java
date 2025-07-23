class Solution {
    static {
        int[] nums = {1, 1, 2, 2, 3};
        for (int i = 0; i < 200; i++) {
            topKFrequent(nums, 2);
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        int res[] = new int[k];        
        for(int i=0; i<k; i++) {
            res[i] = list.get(i).getKey();
        }

        return res;
    }
}