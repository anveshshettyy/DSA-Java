class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> revMap = new HashMap<>();

        char pArr[] = pattern.toCharArray();
        String sArr[] = s.split(" ");

        int plength = pArr.length;
        int slength = sArr.length;

        if(plength != slength) return false;

        for (int i = 0; i < plength; i++) {
            if (map.containsKey(pArr[i])) {
                if (!map.get(pArr[i]).equals(sArr[i])) {
                    return false;
                }
            } else {
                if(revMap.containsKey(sArr[i])) return false;

                map.put(pArr[i], sArr[i]);
                revMap.put(sArr[i], pArr[i]);
            }

        }

        System.out.println(map);

        return true;
    }
}