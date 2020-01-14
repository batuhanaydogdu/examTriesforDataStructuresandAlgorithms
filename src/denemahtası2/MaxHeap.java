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
public class MaxHeap {

    int[] heap;
    int N = 0;

    //int M;
    public MaxHeap(int capacity) {
        heap = new int[capacity];
        N=capacity;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void swap(int a, int b) {
        int c = heap[a];
        heap[a] = heap[b];
        heap[b] = c;
    }

    public void swim(int k) {
        while (k > 1 && heap[k] > heap[k / 2]) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    public void sink(int k) {
        while (2 * k < N) {
          
            int c = 2 * k;
            if (c < N && heap[c] < heap[c + 1]) {
                
                c =c+1;
            }
            if (heap[k] >= heap[c]) {
                
                break;
            }
            swap(k, c);
            k = c;
        }
    }
    public void happyHeapify(){
        int N =heap.length;
        for(int i=N/2;i>=1;i--){
            sink(i);
        }
        while(N>1){
           
            swap(1,--N);
            sink(1);
            
        }
        
        
    }

    @Override
    public String toString() {
        String a="";
        for(int i=0;i<heap.length;i++){
            a=a+heap[i]+" ";
        }
        return a;
        
        
    }
    
    public void insert(int key){
        N++;
        heap[N]=key;
        swim(N);
    }
    public int delMax(){
        int max=heap[1];
        swap(1,N);
        sink(1);
        return max;
    }
    
    public static void main(String[] args) {
        
        MaxHeap seks=new MaxHeap(10);
        seks.heap[1]=3;
        seks.heap[2]=2;
        seks.heap[3]=7;
        seks.heap[4]=9;
        seks.heap[5]=2;
        seks.heap[6]=1;
        seks.heap[7]=11;
        seks.heap[8]=4;
        seks.heap[9]=14;
        System.out.println(seks.toString());
        System.out.println("");
        seks.happyHeapify();


        System.out.println(seks.toString());
        
        
    }
    

}
