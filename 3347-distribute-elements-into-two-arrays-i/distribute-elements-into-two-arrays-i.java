class Solution {
    public int[] resultArray(int[] nums) {
        int[] res = new int[nums.length];
        ArrayList<Integer> li1 = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>();
        li1.add(nums[0]);
        li2.add(nums[1]);

        for(int i=2; i<nums.length; i++) {
            int last1 = li1.get(li1.size() - 1);
            int last2 = li2.get(li2.size() - 1);

            if(last1 > last2) {
                li1.add(nums[i]);
            } else {
                li2.add(nums[i]);
            }
        }

        int i = 0, j = 0;
        for(i=0; i<li1.size(); i++) {
            res[i] = li1.get(i);
        }

        for( i = i; j<li2.size(); i++) {
            res[i] = li2.get(j++);
        }

        // System.out.println(li1+" "+li2);
        return res;
    }
}