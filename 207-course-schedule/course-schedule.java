class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            int u = pre[0];
            int v = pre[1];
            adj.get(v).add(u); 
        }

        int[] visit = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, adj, visit)) {
                return false;
            }
        }

        return true; 
    }

    private boolean dfs(int node, List<List<Integer>> adj, int[] visit) {
        if (visit[node] == 1) return true; 
        if (visit[node] == 2) return false; 

        visit[node] = 1; 

        for (int neighbor : adj.get(node)) {
            if (dfs(neighbor, adj, visit)) {
                return true;
            }
        }

        visit[node] = 2;
        return false;
    }
}
