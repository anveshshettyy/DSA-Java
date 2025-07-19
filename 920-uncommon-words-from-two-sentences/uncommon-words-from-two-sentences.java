class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String st1[] = s1.split(" ");
        String st2[] = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for(String s: st1) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for(String s:st2) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        ArrayList<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> e: map.entrySet()) {
            if(e.getValue() == 1) {
                res.add(e.getKey());
            }
        }

        return res.toArray(new String[0]);
    }
}