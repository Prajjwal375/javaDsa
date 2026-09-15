class Solution {

    public boolean validTree(int n, int[][] edges) {

        if (edges.length != n - 1) {
            return false;
        }

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] vis = new boolean[n];

        if (detectCycleUtil(graph, vis, 0, -1)) {
            return false;
        }

        // Check all nodes are connected
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                return false;
            }
        }

        return true;
    }


    public boolean detectCycleUtil(
        ArrayList<Integer>[] graph,
        boolean[] vis,
        int curr,
        int par) {

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            int neighbor = graph[curr].get(i);

            // Case 3: not visited
            if (!vis[neighbor] &&
                detectCycleUtil(graph, vis, neighbor, curr)) {

                return true;
            }

            // Case 1: visited and not parent
            else if (vis[neighbor] && neighbor != par) {

                return true;
            }

            // Case 2: parent
            // do nothing -> continue
        }

        return false;
    }
}