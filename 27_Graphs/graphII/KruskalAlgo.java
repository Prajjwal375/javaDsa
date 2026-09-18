import java.util.ArrayList;
public class KruskalAlgo {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public class DisjointSet {
    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0; i<n; i++){
            par[i] = i;
        }
    }
    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return par[x] = find(par[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }
    }

    public static void kruskalsMST(ArrayList<Edge> edges, int V){
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;

        for(int i=0; count < V-1; i++){
            Edge e = edges.get(i);
            // src, dest, wt

            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB){
                union(e.src, e.dest);
                mstCost += e.wt;
                

            }
        }
        System.out.println("MST cost: " + mstCost);
    }

    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalsMST(edges, V);

    }
        

}
    
