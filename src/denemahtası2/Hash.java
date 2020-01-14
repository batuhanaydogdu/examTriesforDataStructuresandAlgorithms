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
public class Hash<se> {

    se[] table;
    int M;
    boolean[] valid;

    public Hash(int M) {
        table = (se[]) new Object[M];
        valid = new boolean[M];
        this.M = M;
    }

    public boolean insert(se key) {
        int ix = hash(key);
        table[ix] = key;
        valid[ix] = true;
        return true;
    }

    public int hash(se key) {
        return key.hashCode() % M;
    }

}
