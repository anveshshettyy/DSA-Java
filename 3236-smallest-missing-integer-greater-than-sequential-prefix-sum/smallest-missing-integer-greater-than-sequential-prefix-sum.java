class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int num : nums) {
            li.add(num);
        }
        int sum = 0;
        sum = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]+1){
                sum += nums[i];
            } else {
                break;
            }
        }
        while(li.contains(sum)) {
            sum++;
        }
        return sum;
    }
}