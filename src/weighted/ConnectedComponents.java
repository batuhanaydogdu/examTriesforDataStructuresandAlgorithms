/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weighted;

/**
 *
 * @author win7
 */
public class ConnectedComponents {
    private boolean marked[];
    private int count;
    private int[] id;
    
    public ConnectedComponents(EdgeWeightedGraph g){
        marked = new boolean[g.V()];
        count = 0; 
        id  = new int[g.V()];
        for(int v = 0; v < g.V(); v++){
            if(!marked[v]){
                dfs(g,v);
                count++;
            }             
        }
    }
    
    public void dfs(EdgeWeightedGraph g, int v){
        marked[v] = true;
        id[v] = count;
        Edge[] a = (Edge[]) g.neighborsArray(v);
        for(int i = 0; i < a.length; i++){
            if(!marked[v]){
                dfs(g,v);
            }
        }

    }
}
