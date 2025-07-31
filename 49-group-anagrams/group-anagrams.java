class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }

        for(List<String> group: map.values()) {
            list.add(group);
        }

        return list;
    }
}