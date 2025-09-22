class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxNum = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int temp = map.get(num);
                map.put(num, temp+1);
                maxNum = Math.max(temp+1, maxNum);
            }
        }

        int res = 0;
        for(int key: map.keySet()) {
            if(map.get(key) == maxNum) {
                res++;
            }
        }

        System.out.println(maxNum);
        System.out.println(map);
        return res*maxNum;
    }
}