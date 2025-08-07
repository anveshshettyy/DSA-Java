class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums) {
            if(map.containsKey(num) && map.get(num) == 2) {
                continue;
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int j = 0;

        System.out.println(map);

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int freq = entry.getValue();
            int key = entry.getKey();

            while(freq-- > 0) {
                nums[j++] = key;
            }
        }

        for(int i=j; i<nums.length; i++) {
            nums[i] = Integer.MAX_VALUE;
        }

        Arrays.sort(nums);

        return j;
    }
}