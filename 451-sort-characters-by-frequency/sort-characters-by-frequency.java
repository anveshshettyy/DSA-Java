class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        StringBuilder res = new StringBuilder("");
        for (Map.Entry<Character, Integer> e : list) {
            char ch = e.getKey();
            int freq = e.getValue();
            for (int i = 0; i < freq; i++) {
                res.append(ch);
            }
        }
        return res.toString();
    }
}