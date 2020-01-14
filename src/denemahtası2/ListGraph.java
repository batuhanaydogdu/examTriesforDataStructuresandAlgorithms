/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemahtası2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author win7
 */
public class ListGraph {

    LinkedList<Integer>[] edges;
    private int numV;
    private int numE;

    public ListGraph(int V) {
        this.numV = V;
        edges = (LinkedList<Integer>[]) new LinkedList[numV];
        for (int i = 0; i < numV; i++) {
            edges[i] = new LinkedList();
        }

    }

    public int getNumV() {
        return numV;
    }

    public int getNumE() {
        return numE;
    }

    public void addEdge(int from, int to) {
        if (from >= 0 && from < numV && to >= 0 && to < numV) {
            edges[from].add(to);
            edges[to].add(from);
            numE++;
        } else {
            System.out.println("Vertex out of bounds!");

        }
    }

    public void removeEdge(int from, int to) {
        if (edges[from].contains(to)) {
            edges[from].remove(to);
            edges[to].remove(from);

        } else {
            System.out.println("Edge not found!");
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < numV; i++) {
            sb.append(i + " " + edges[i].toString() + "\n");
        }

        return sb.toString();
    }

    public boolean isAdjacent(int from, int to) {
        return edges[from].contains(to);
    }

    public LinkedList<Integer> neighborsList(int from) {
        return (LinkedList<Integer>) edges[from].clone();
    }

    public Integer[] neighborsArray(int from) {
        Integer[] ar = new Integer[edges[from].size()];
        edges[from].toArray(ar);
        return ar;
    }

    public int degree(int from) {
        return edges[from].size();
    }

    public void createGraphFromAdjList(String filename) {
        File f = new File(filename);
        try {
            Scanner x = new Scanner(f);
            int v = x.nextInt();
            int e = x.nextInt();

            for (int i = 0; i < e; i++) {
                int v1 = x.nextInt();
                int v2 = x.nextInt();
                this.addEdge(v1, v2);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("dosya yok");
        }

    }

}
