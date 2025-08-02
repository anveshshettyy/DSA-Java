class Solution {
    List<List<Integer>> res = new ArrayList<>();
    void helper(int[] nums, int pos, int n, ArrayList<Integer> arr) {
        if(pos == n) {
            res.add(new ArrayList<Integer>(arr));
            return;
        }

        arr.add(nums[pos]);
        helper(nums, pos+1, n, arr);

        arr.remove(arr.size()-1);
        helper(nums, pos+1, n, arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, nums.length, new ArrayList<Integer>());
        return res;
    }
}