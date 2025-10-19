class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] vis = new int[n];

        int count = 0;
        for(int i=0; i<n; i++) {
            if(vis[i] == 0) {
                count++;
                dfs(isConnected, i, vis);
            }
        }

        return count;
    }

    public void dfs(int[][] graph, int node, int[] vis) {
        vis[node] = 1;
        for(int i=0; i<graph[0].length; i++) {
            if(vis[i] == 0 && graph[node][i] == 1) {
                dfs(graph, i, vis);
            }
        }
    }
}