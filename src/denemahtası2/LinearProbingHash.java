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
public class LinearProbingHash<se> {
    
    
    se [] table;
    int M; // size of the table
    int N; // number of currently stored
    boolean[] full;  // Not necessary here
    
    public LinearProbingHash(int M){
        table = (se[]) new Object[M];
        full= new boolean[M];
        this.M = M;
    }

}
