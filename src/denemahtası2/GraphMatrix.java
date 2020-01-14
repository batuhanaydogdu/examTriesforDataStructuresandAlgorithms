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
public class GraphMatrix {
    int edges[][];
    int numV;
    int numE;
    
    public GraphMatrix(int V){
        this.numV=V;
        edges=new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                edges[i][j]=0;
            }
        }
    }
    public void addEdges(int from,int to,int weight){
        edges[from][to]=weight;
        edges[to][from]=weight;
        
    }
    public void removeEdges(int from,int to){
        edges[from][to]=0;
        edges[to][from]=0;
    }
    public boolean isAdjacent(int v1,int v2){
        return (edges[v1][v2]!=0);
    }
    public int degree(int v){
        int degree=0;
        for(int i=0;i<numV;i++){
            if(edges[v][i]!=0){
                degree++;
            }
        }
        return degree;
    }
    
    
}
