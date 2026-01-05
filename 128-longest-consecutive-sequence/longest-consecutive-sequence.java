class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) set.add(n);

        int prev = Integer.MIN_VALUE;
        int count = 0, max = 0;

        for (int curr : set) {
            if (curr == prev + 1) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
            prev = curr;
        }
        return max;
    }
}
