class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0, res = 0;
        PriorityQueue<Integer> l1 = new PriorityQueue<>();
        PriorityQueue<Integer> l2 = new PriorityQueue<>();

        for(int num: nums) {
            sum += num;
            if(num%3 == 1) l1.add(num);
            if(num%3 == 2) l2.add(num);
        }

        int rem = sum % 3;
        if(rem == 0) return sum;
        if(rem == 1) {
            int ans1 = (l1.size() >= 1) ? sum - l1.poll() : 0;
            int ans2 = (l2.size() >= 2) ? sum - l2.poll() - l2.poll() : 0;
            res = Math.max(ans1, ans2);
        } else {
            int ans1 = (l2.size() >= 1) ? sum - l2.poll() : 0;
            int ans2 = (l1.size() >= 2) ? sum - l1.poll() - l1.poll() : 0;
            res = Math.max(ans1, ans2);
        }

        return res;
    }
}