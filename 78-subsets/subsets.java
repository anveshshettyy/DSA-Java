class Solution {
    List<List<Integer>> res = new ArrayList<>();
    void fun(int[] nums, int pos, int end, List<Integer> arr) {
        if(pos == end) {
            res.add(new ArrayList<>(arr));
            return;
        }

        arr.add(nums[pos]);
        fun(nums, pos+1, end, arr);

        arr.remove(arr.size()-1);
        fun(nums, pos+1, end, arr);

    }
    public List<List<Integer>> subsets(int[] nums) {
        fun(nums, 0, nums.length, new ArrayList<>());
        return res;
    }
}