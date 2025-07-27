class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<edges.length; i++) {
            for(int j=0; j<2; j++) {
                map.put(edges[i][j], map.getOrDefault(edges[i][j], 0)+1);
            }
        }

        int res = 0, maxFreq = 0;
        for(int key : map.keySet()) {
            if(map.get(key) > maxFreq) {
                res = key;
                maxFreq = map.get(key);
            }
        }

        return res;
    }
}