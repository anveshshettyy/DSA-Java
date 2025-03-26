class Solution {
    public int singleNumber(int[] nums) {
        // int unique = nums[0];
        // for(int i=1; i<nums.length; i++) {
        //     int a = nums[i];
        //     unique ^= a;
        // }
        // return unique;

        HashMap<Integer, Integer> hash = new HashMap<>();
        int unique = 0;

        for(int i: nums) {
            if(! hash.containsKey(i)) {
                hash.put(i,0);
            } 
            hash.put(i, hash.get(i)+1);
        }

        for(int i:nums) {
            if(hash.get(i) == 1) {
                unique = i;
            }
        }

        return unique;

    }
}