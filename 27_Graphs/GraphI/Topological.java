import java.util.*;
public class Topological {
    static class Edge{
        int src;
        int dest;
        

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
            
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
         for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // 0-vertex
        graph[0].add(new Edge(0, 2));
        
        
        // 1-vertex
        graph[1].add(new Edge(1, 0));
       
        //2-vertex
       graph[2].add(new Edge(2, 3));
      
       graph[3].add(new Edge(3, 0));      
        

    }


    // Topological sort using DFS
    public static void topSort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                topSortUtil(graph, vis, s, i);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    public static void topSortUtil(ArrayList<Edge>[] graph, boolean vis[], Stack<Integer> s, int curr){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph, vis, s, e.dest);
            }
        }
        s.push(curr);
    }



    ////////////////////////////////////////////////////////////////////////////////
    ///
    ///
    
    // Topological sort using BFS
    public static void topSortBFS(ArrayList<Edge>[] graph){
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        // bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " "); // topological sort

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    
    public static void calcIndeg(ArrayList<Edge>[] graph, int indeg[]){
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }  
    }



    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        

    } 

}