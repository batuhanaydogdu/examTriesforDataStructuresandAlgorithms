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
public class Queue<seks> {
    
    private int size;
    private Node<seks> first;
    private Node<seks> last;
    private seks[] arr;
    private int first2;
    private int last2;

    
    public Queue(){
        first=null;
        last=null;
        size=0;
    }
    private void resize(int capacity){
        seks[] ar=(seks[]) new Object[capacity];
        for(int i=0;i<arr.length;i++){
            ar[i]=arr[(first2+i)%arr.length];
        }
        arr=ar;
        first2=0;
        last2=size;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(seks a){
        Node<seks> oldLast=last;
        last=new Node();
        last.data=a;
        last.next=null;
        if(isEmpty())
            first=last;
        else
            oldLast.next=last;
        size++;
        
    }
    public seks dequeue(){
     if(isEmpty()){
         return null;
     }
     Node<seks> a=first;
     first=first.next;
     size--;
     if(isEmpty())
         last=null;
     return a.data;
        
    }
    
    private class Node<seks>{
        Node<seks> next;
        seks data;

        public Node( seks data) {
            
            this.data = data;
        }

        public Node() {
        }
        
        
    }
    
}
