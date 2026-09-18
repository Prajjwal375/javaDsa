class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indeg = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
                

        for(int i = 0; i< numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int u = edge[0];
            int v = edge[1];
         
            graph.get(v).add(u);
            indeg[u]++;
        }
      
        for(int i=0; i<numCourses; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        int[] res = new int[numCourses];
        int idx = 0;
        while(!q.isEmpty()){
            int curr = q.remove();
            res[idx++] = curr;

            for(int i=0; i<graph.get(curr).size(); i++){
                int neighbour = graph.get(curr).get(i);
                indeg[neighbour]--;
                if(indeg[neighbour] == 0){
                    q.add(neighbour);
                }
            }
            if(idx == numCourses){
                return res;
            }
        }
        return new int[0];
    }    
}