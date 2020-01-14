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
    //el alçılıseks
    class Stack<seks> {
        private int top;
        
        private seks[] arr;

        public Stack(int capacity) {
            arr=(seks[])new Object[capacity];
            top=-1;
        }
        public boolean isEmpty(){
            
            return top==-1;
            
        }
        public boolean isFull(){
            
            return (top+1)==arr.length;
        }
        public void push(seks a) {
            if(!isFull()){
                top++;
                arr[top]=a;
                
            }
            else
            {resize(arr.length*2);
            top++;
            arr[top]=a;
                
                
            }
            
        }
        public seks pop(){
            
            if(isEmpty()){
               
               return null;
            }
            if(arr.length/4>=top)
            {
                resize(arr.length/2);
            }
            if(!isEmpty()){
                seks a=arr[top];
               top--;
               return a;
            }
             return null;   
            
        }
        private void resize(int n){
             seks[] arr2=(seks[])new Object[n];
             for(int i=0;i<arr.length;i++){
                 arr2[i]=arr[i];
             }
            arr=arr2;
        }

    @Override
    public String toString() {
        return "scanım güzel birtanecik sevgilim irem sex"+top;
    }
        
        public static void main(String[] args) {
            
            
            Telefon iremtel=new Telefon("mor", "oppo a50");
            iremtel.setName("agresif oldugu için üzgün");
            
        }
        
    }
    

