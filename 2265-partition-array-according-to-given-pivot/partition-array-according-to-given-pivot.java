class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                smaller.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        int[] res = new int[nums.length];
        int index = 0;

        for (int num : smaller) {
            res[index++] = num;
        }

        for (int num : equal) {
            res[index++] = num;
        }

        for (int num : greater) {
            res[index++] = num;
        }

        return res;
    }
}