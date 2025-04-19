class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i])+1);
                max = Math.max(max , hm.get(nums[i]));
            } else {
                hm.put(nums[i], 1);
                max = Math.max(max , hm.get(nums[i]));
            }
        } 
        int count = 0;
        for(int i:nums) {
            if(hm.get(i) == max) count++;
        }
        return count;
    }
}