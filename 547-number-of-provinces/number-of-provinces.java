class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] vis = new int[n];
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(isConnected[i][j] == 1 && i != j) {
                    graph.get(i).add(j);
                }
            }
        }
        
        int res = 0;
        for(int i=0; i<n; i++) {
            if(vis[i] == 0) {
                dfs(graph, vis, i);
                res++;
            }
        }
        return res;
    }

    public void dfs(List<List<Integer>> graph, int[] vis, int i) {
        vis[i] = 1;
        for(int j=0; j<graph.get(i).size(); j++) {
            int neighbour = graph.get(i).get(j);
            if(vis[neighbour] == 0) {
                dfs(graph, vis, neighbour);
            }
        }
    }
    
}