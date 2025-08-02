class Solution {
    List<List<Integer>> res = new ArrayList<>();
    void fun(int[] nums, int i) {
        if(i==nums.length) {
            ArrayList<Integer> arr = new ArrayList<>();
            for(int num:nums) arr.add(num);
            res.add(new ArrayList<>(arr));
            return;
        }

        for(int j=i; j<nums.length; j++) {
            swap(i, j, nums);
            fun(nums, i+1);
            swap(i, j, nums);
        }
    }

    void swap(int i, int j,int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        fun(nums, 0);
        return res;
    }
}