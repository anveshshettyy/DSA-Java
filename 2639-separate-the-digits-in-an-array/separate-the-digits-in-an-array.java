class Solution {
    public int[] separateDigits(int[] nums) {
        String temp = "";
        for(int num: nums) {
            temp += num;
        }

        int res[] = new int[temp.length()];
        for(int i=0; i<temp.length(); i++) {
            res[i] = temp.charAt(i) - '0';
        }

        return res;
    }
}