/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.Arrays;

/**
 *
 * @author win7
 */
public class sort {

    static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    static void swap(Comparable[] a, int i, int j) {
        if (i == j) {
            return;
        }
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].compareTo(a[i + 1]) > 0) {
                return false;
            }

        }
        return true;
    }

    static void selSort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            swap(a, i, min);
        }

    }

    static void print(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void insertionSort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    swap(a, j, j - 1);
                } else {
                    break;
                }
            }
        }

    }

    static void shellSort(Comparable[] a) {
        int n = a.length;
        for (int k = 0; k < a.length; k++) {
            int h = (int) a[k];

            for (int i = h; i < n; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (less(a[j], a[j - h])) {
                        swap(a, j, j - h);
                    } else {
                        break;
                    }
                }

            }
        }
    }

    static void shellSort2(Comparable[] a) {//this version is better
        int h = 1;
        int n = a.length;
        while (h < n / 3) {
            h = 3 * h + 1; //1, 4, 13,40..
        }
//do the insertion sort for each h 
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (less(a[j], a[j - h])) {
                        swap(a, j, j - h);
                    } else {
                        break;
                    }
                }
            }
            h = h / 3;
        }

    }

    public static int[] merge(int[] a, int[] b) {
        int m = a.length + b.length;
        int[] out = new int[m];
        int aix = 0;
        int bix = 0;

        for (int i = 0; i < m; i++) {

            if (aix < a.length && bix < b.length) {
                if (a[aix] < b[bix]) {
                    out[i] = a[aix];
                } else {
                    out[i] = b[bix];
                }

            } else if (aix < a.length) {
                out[i] = a[aix];
            } else if (bix < b.length) {
                out[i] = b[bix];
            }

        }
        return out;

    }

    public static int[] mergeSort(int[] in) {
        if (in.length == 1) {
            return in;
        }
        int mid = (in.length) / 2;
        int[] a = Arrays.copyOfRange(in, 0, mid);
        int[] b = Arrays.copyOfRange(in, mid, in.length);

        a = mergeSort(a);
        b = mergeSort(b);
        return merge(a, b);

    }

    private static void mergeSort2(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = (lo + hi) / 2;
        mergeSort2(a, aux, lo, mid);
        mergeSort2(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);

    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        System.arraycopy(a, 0, aux, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }

        int j = lo;  // first half index
        int k = mid + 1; // second half index

        // in each iteration copy from first half or second
        for (int i = lo; i <= hi; i++) {
            if (j <= mid && k <= hi) {
                if (less(aux[j], aux[k])) {
                    a[i] = aux[j++];
                } else {
                    a[i] = aux[k++];
                }
            }

        }
    }

    ////////////////////////////////////////////////////////////////////
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);

        sort(a, lo, j - 1);
        sort(a, j + 1, hi);

    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int piv = (int) a[lo];
        int i = lo + 1;
        int j = hi;

        while (i <= j) {
            while (i <= j && (int) a[i] <= piv) {
                i++;
            }
            while (i <= j && (int) a[j] >= piv) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, lo, j);
        return j;

    }
    
    
    
    

    public static void main(String[] args) {
        Comparable[] a = {1, 3, 6, 5, 3, 234, 4, 76, 12, 89};
        print(a);
        selSort(a);
        System.out.println("");
        print(a);
        System.out.println("");
        System.out.println("");
        Comparable[] b = {1, 3, 6, 5, 3, 234, 4, 76, 12, 89};
        print(b);
        System.out.println("");
        insertionSort(b);
        print(b);
        System.out.println("");
        System.out.println("");
        Comparable[] c = {1, 3, 6, 5, 3, 234, 4, 76, 12, 89};
        print(c);
        System.out.println("");
        shellSort(c);
        print(c);
        System.out.println("");
        System.out.println("");
        Comparable[] d = {1, 3, 6, 5, 3, 234, 4, 76, 12, 89};
        print(d);
        System.out.println("");
        shellSort2(d);
        print(d);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Comparable[] e = {1, 3, 6, 5, 3, 234, 4, 76, 12, 89};
        print(e);
        System.out.println("");
        sort(e,0,e.length-1);
        print(e);
    }

}
