class Solution {
    public List<List<Integer>> list = new ArrayList<>();
    public void subset(int[] nums, ArrayList<Integer> arr, int pos, int n) {
        if(pos == n) {
            list.add(new ArrayList<Integer>(arr));
            return;
        }

        arr.add(nums[pos]);
        subset(nums, arr, pos+1, n);

        arr.remove(arr.size()-1);
        subset(nums, arr, pos+1, n);
    }
 
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        subset(nums, arr, 0, nums.length);
        return list;
    }
}