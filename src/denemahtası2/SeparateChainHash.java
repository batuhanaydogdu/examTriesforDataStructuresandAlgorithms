/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemahtası2;

import java.util.LinkedList;

/**
 *
 * @author win7
 */
public class SeparateChainHash<se> {

    int M;
    LinkedList<se>[] table;

    public SeparateChainHash(int M) {
        table = new LinkedList[M];
        for (int ix = 0; ix < M; ix++) {
            table[ix] = new LinkedList<se>();
        }
        this.M=M;

    }
    public void insert(se s){
        int ix=hash(s);
        if(!contains(s)){
        table[ix].add(s);
        }
        else
            System.out.println("olmadı");
    }
    public boolean contains(se s){
        int ix = hash(s);
       return table[ix].contains(s);
        
}

    
    public int hash(se key) {
        return key.hashCode() % M;
    }

}
