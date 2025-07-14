class Solution {
    public int sum = 0;
    public void subset(int[] nums, ArrayList<Integer> arr, int pos, int n) {
        if(pos == n) {
            int xor = 0;
            for(int i=0; i<arr.size(); i++) {
                xor ^= arr.get(i);
            }
            sum += xor;
            return;
        }

        arr.add(nums[pos]);
        subset(nums, arr, pos+1, n);

        arr.remove(arr.size()-1);
        subset(nums, arr, pos+1, n);
    }

    public int subsetXORSum(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        subset(nums, arr, 0, nums.length);
        return sum;
    }
}