class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i: nums) {
            set.add(i);
        }

        int j = 0;
        for(int i: set) {
            nums[j++] = i;
        }

        return j;
    }
}