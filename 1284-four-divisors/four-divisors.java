class Solution {
    public int sumFourDivisors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int count = 0, sum = 0, tsum = 0;
        for(int num: nums) {
            sum = 0; count = 0;
            if(set.contains(num)) continue;
            if(map.containsKey(num)) {
                tsum += map.get(num);
                continue;
            }

            for(int i=1; i<=num; i++) {
                if(num%i==0) {
                    sum += i;
                    count++;
                }
                if (count > 4) {
                    set.add(num);
                    break;
                }
            }
            if(count == 4) {
                tsum += sum;
                map.put(num, sum);
            }
        }
        return tsum;
    }
}