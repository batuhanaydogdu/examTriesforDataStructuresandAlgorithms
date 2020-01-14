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
public class Hashasd<se> {

//    se[] table;
//    int M;
//    boolean[] valid;
//
//    public Hash(int M) {
//        table = (se[]) new Object[M];
//        valid = new boolean[M];
//        this.M = M;
//    }
//
//    public boolean insert(se se) {
//        int ix = hash(se);
//        table[ix] = se;
//        valid[ix] = true;
//        return true;
//
//    }
//
//    public int hash(se se) {
//        return se.hashCode() % M;
//    }
//
//    public class SeparateChainHash<se> {
//
//        int M;
//        LinkedList<se>[] table;
//
//        public SeparateChainHash(int M) {
//            table = new LinkedList[M];
//            for (int ix = 0; ix < M; ix++) {
//                table[ix] = new LinkedList<se>();
//            }
//            this.M = M;
//
//        }
//
//        public void insert(se t) {
//            int ix = hash(t);
//            table[ix].addFirst(t);
//        }
//
//        public boolean contains(se t) {
//            int ix = hash(t);
//            return table[ix].contains(t);
//
//        }
//
//    }
//
//    public class LinearProbingHash<Key,Value> {
//
//        Key[] table;
//         private Value[] vals;
//        int M; // size of the table
//        int N; // number of currently stored
//        boolean[] full;  // Not necessary here
//
//        public LinearProbingHash(int M) {
//            table = (Key[]) new Object[M];
//            full = new boolean[M];
//            this.M = M;
//        }
//
//        public int hash(Key Key) {
//            return Key.hashCode() % M;
//        }
//
//        public boolean insert(Key key) {
//            int ix = hash(key);
//// must check for a whole cycle there can be infinite 
//            int startIx = ix;
//            while (table[ix] != null) {
//                if (ix + 1 == startIx) {
//                    return false; // Table is full			
//                }
//                if (table[ix].equals(key)) {
//                    return false; //Table has got the key	
//                }
//                ix = (ix + 1) % M;
//            }
//// this means table[ix] is empty
//            table[ix] = key;
//            N++;
//            return true;
//        }
////        public boolean contains(Key key) {
////        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
////        return get(key) != null;
////    }
////        public Value get(Key key) {
////        if (key == null) throw new IllegalArgumentException("argument to get() is null");
////        for (int i = hash(key); keys[i] != null; i = (i + 1) % m)
////            if (keys[i].equals(key))
////                return vals[i];
////        return null;
////    }
//
////        public void delete(Key key){
////            if(!contains(key))return;
////            int i=hash(key);
////            
////            
////        }
//
//    }
}
