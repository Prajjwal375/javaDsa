class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];

        //loop o to n
        for(int i =0; i< n; i++){
            graph[i] = new ArrayList<>();
        }

        // add edges to graph
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            // bidirectional 
            graph[u].add(v);
            graph[v].add(u);
        }
        boolean[] vis = new boolean[n];

        return dfs(graph,source,destination,vis);

    }

    public static boolean dfs(ArrayList<Integer>[] graph, int src, int dest, boolean[] vis){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i=0; i< graph[src].size(); i++){
            int neighbour = graph[src].get(i);
            if(!vis[neighbour] && dfs(graph, neighbour, dest, vis)){
                return true;
            }
        }
        return false;
    }
}