class Solution {
    public boolean check(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        int flag = -1;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (flag != -1)
                li.add(nums[i]);
            if (nums[i - 1] > nums[i]) {
                flag = i;
                li.add(nums[i]);
            }
        }

        if (li.isEmpty())
            return true;

        for (int i = 0; i < flag; i++) {
            li.add(nums[i]);
        }

        for (int i = 1; i < li.size(); i++) {
            if (li.get(i) < li.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}