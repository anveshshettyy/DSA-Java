class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey() - a.getKey(); 
            }
            return a.getValue() - b.getValue();
        });

        int i = 0;
        for (Map.Entry<Integer, Integer> e : entryList) {
            int freq = e.getValue();
            while (freq-- > 0) {
                nums[i++] = e.getKey();
            }
        }
        return nums;
    }
}