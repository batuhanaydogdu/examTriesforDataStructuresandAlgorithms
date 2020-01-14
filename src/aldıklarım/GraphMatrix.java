/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aldıklarım;

/**
 *
 * @author btek
 */
public class GraphMatrix {

    int edges[][]; // can be anything, but int vertices handy
    // can be double if there are double weigths
    int numV;
    int numE;

    /**
     * @param args the command line arguments
     */
    public GraphMatrix(int V) {
        this.numV = V;
        edges = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                edges[i][j] = 0;
            }
        }
    }

    public void addEdge(int from, int to, int weight) {
        edges[from][to] = weight;
    }

    public boolean isAdjacent(int v1, int v2) {
        return (edges[v1][v2] != 0);
    }

    public int degree(int v) {
        int degree = 0;
        for (int i = 0; i < numV; i++) {
            if(edges[v][i]!=0) 
				degree++;
        }
        return degree;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < numV; i++) {
            for (int j = 0; j < numV; j++) {
                s.append(edges[i][j]+" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GraphMatrix g = new GraphMatrix(5);
        g.addEdge(0, 1, 1);
        g.addEdge(0, 3, 5);
        g.addEdge(1, 4, 1);
        g.addEdge(3, 2, 1);

        System.out.println(g);

    }
}
