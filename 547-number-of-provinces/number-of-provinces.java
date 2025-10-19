class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> graph = new ArrayList<>();
        int n = isConnected.length;
        for(int i=0; i<n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i!=j && isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                }
            }
        }

        int vis[] = new int[n];

        int count = 0;
        for(int i=0; i<n; i++) {
            if(vis[i] == 0) {
                count++;
                dfs(graph, i, vis);
            }
        }
        return count;
    }
    public void dfs(List<List<Integer>> graph, int node, int[] vis) {
        vis[node] = 1;
        for(int i=0; i< graph.get(node).size(); i++) {
            int neighbour = graph.get(node).get(i);
            if(vis[neighbour] == 0) {
                dfs(graph, neighbour, vis);
            }
        }
    }
}