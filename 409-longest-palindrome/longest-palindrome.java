class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int sum = 0, flag = 0;
        for(Map.Entry <Character, Integer> e : map.entrySet()) {
            int val = e.getValue();
            if(val%2 != 0){
                sum += val - 1;
                flag = 1;
            } 
            else sum += val;
        }
        System.out.println(map);
        
        sum += (flag == 1) ? 1 : 0;
        
        return sum;
    }
}