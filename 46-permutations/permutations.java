class Solution {
    List <List<Integer>> res = new ArrayList<>();
    void helper(int[] nums, int i) {
        if(i == nums.length) {
            List<Integer> arr = new ArrayList<>();
            for (int num : nums) arr.add(num);
            res.add(new ArrayList<>(arr));
            return;
        }

        for(int j=i; j<nums.length; j++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            helper(nums, i+1);
            
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, 0);
        return res;
    }
}