class Solution {
    List <List<Integer>> res = new ArrayList<>();
    public void fun(int[] nums, ArrayList<Integer> li, int pos) {
        if(pos >= nums.length) {
            if(!res.contains(li)) res.add(new ArrayList<>(li));
            return;
        }

        li.add(nums[pos]);
        fun(nums, li, pos+1);

        li.remove(li.size()-1);
        fun(nums, li,pos+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        fun(nums, new ArrayList<>(), 0);
        return res;
    }
}