class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Arrays.sort(nums);
        int small = nums[0], high = nums[nums.length-1], j=0;
        for(int i=small; i<=high; i++) {
            if(nums[j] != i) {
                li.add(i);
            } else {
                j++;
            }
        }
        return li;
    }
}