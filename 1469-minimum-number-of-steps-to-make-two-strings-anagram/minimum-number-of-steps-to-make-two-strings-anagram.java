class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int count = 0;
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                count++;
            }
        }
        System.out.println(map);
        return count;
    }
}