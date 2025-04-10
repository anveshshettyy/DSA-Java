class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int j = 1;
        for(int i:nums)  hs.add(i);

        // for(int i:hs) {
        //     if(i > 0 && j>=i)  j++;
        // }

        for(int i=1; i<= nums.length+1; i++) {
            if(!hs.contains(i)) return i;
        }
        return 1;
    }
}