
package Graph1;
   import java.io.*;
import java.util.*; 

public class DFS {
    private int V; 
    private LinkedList<Integer> adj[];
 
    @SuppressWarnings("unchecked") DFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
 
    // fungsi add an edge 
    void addEdge(int v, int w)
    {
        adj[v].add(w); 
    }
 
    // A function used by DFS
    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v + " ");
 
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);}}
    void DFS(int v){
        boolean visited[] = new boolean[V];  
        DFSUtil(v, visited);}
    public static void main(String args[]){
        DFS graf = new DFS(4);
        graf.addEdge(0, 1);
        graf.addEdge(0, 2);
        graf.addEdge(1, 2);
        graf.addEdge(2, 0);
        graf.addEdge(2, 3);
        graf.addEdge(3, 3);
        System.out.println("Visit by using DFS algorithm "
                            + "(starting from vertex 1)");
 
        graf.DFS(1);
    }
}
    


    

