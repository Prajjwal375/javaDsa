class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     
        List<List<Integer>> graph = new ArrayList<>();
        boolean[] vis = new boolean[numCourses];
        boolean[] stack = new boolean[numCourses];

        for(int i = 0; i< numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int u = edge[0];
            int v = edge[1];
         
            graph.get(v).add(u);
        }
        // check for cycle
        for(int i=0; i<numCourses; i++){
            if(!vis[i]){
                if(dfs(graph,vis,stack,i)){
                return false;
                }
            }
        }
        return true;
    }
    public static boolean dfs(List<List<Integer>> graph, boolean vis[], boolean stack[], int curr){
        vis[curr] = true;
        stack[curr] = true;
        for(int i =0; i< graph.get(curr).size(); i++){
            int neighbour = graph.get(curr).get(i);
            if(stack[neighbour]){
                return true;
            }
            if(!vis[neighbour] && dfs(graph,vis,stack,neighbour)){
                return true;
            }
        }
        stack[curr] = false;
        return false;        
    }
}