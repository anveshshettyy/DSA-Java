class Solution {
    public void subset(int[] nums,List<Integer> arr, int pos, int n,List<List<Integer>> res) {
        if(pos == n) {
            for(Integer ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
            res.add(new ArrayList<Integer>(arr));
            return;
        }
        arr.add(nums[pos]);
        subset(nums, arr, pos+1, n,res);
        arr.remove(arr.size()-1);
        subset(nums, arr, pos+1, n,res);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        subset(nums, arr, 0, nums.length,res);
        return res;
    }
}