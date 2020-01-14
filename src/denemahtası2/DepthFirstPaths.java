/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemahtası2;

/**
 *
 * @author win7
 */
public class DepthFirstPaths {
    int from;
    boolean[] marked;
    int[] edgeTo;

    public DepthFirstPaths(ListGraph g,int from) {
        this.from=from;
        marked=new boolean[g.getNumV()];
        edgeTo=new int[g.getNumV()];
        dfs(g,from);
        
        
        
    }
    public void dfs(ListGraph g,int from){
        
        marked[from]=true;
        Integer[] a=(Integer[])g.neighborsArray(from);
        for(int i=0;i<a.length;i++){
            int neighbor=a[i];
            if(!marked[neighbor]){
                dfs(g,neighbor);
                edgeTo[neighbor]=from;
            }
            
            
            
        }
        
        
        
        
    }
    boolean hasPathTo(int w) {
        return marked[w];
    }

    
    
    public Integer[] pathTo(int w) {
        int k = edgeTo[w];
        java.util.Stack<Integer> st = new java.util.Stack<Integer>();        st.push(k);
       
        while (k != this.from) {
            k = edgeTo[k];
            st.push(k);
        }
        st.push(from);
        
        Integer[] path = new Integer[st.size()];
        for (int i = 0; i <path.length; i++)
            path[i] = st.pop();
        return path;
        
    }
    
    public static void main(String[] args) {
        
        ListGraph g1 = new ListGraph(9);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(4, 5);
        g1.addEdge(3, 6);
        g1.addEdge(4, 6);
        g1.addEdge(7, 8);
        DepthFirstPaths dfs=new DepthFirstPaths(g1, 0);
        System.out.println(dfs.hasPathTo(8));
        Integer[] a=dfs.pathTo(8);
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
    
    
    
    
    
    
}
