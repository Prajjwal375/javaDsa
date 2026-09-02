import java.util.*;
public class cycleDetect {
    static class Edge{
        int src;
        int dest;
        

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
            
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                    // cycle exists in one of the parts
                }
            }
        }
        return false;

    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par){
        vis[curr] = true;
        for(int i = 0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            // case 3
            if(!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, curr)){
                return true;
            }// case 1
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
            // case 2 do nothing -> continue

        }
        return false;
    }

    ///////////////////////////////////////////////////////////////////////////

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

    ////////////////////////////////////////////////////////////////////////////

    // directed graph detect cycle
    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph, vis, stack, i)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, boolean vis[], boolean stack[], int curr){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ // if cycle // stack neighbour
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, vis, stack, e.dest)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    /////////////////////////////////////////////////////////

    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));

        System.out.println(isCycle(graph));
    }
}