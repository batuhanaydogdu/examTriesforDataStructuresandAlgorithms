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
public class AVLTre<se> {
    AVLNode root;

    public AVLTre() {
    root=null;
    }
    int height(AVLNode<se> d){
        if(d==null)
            return 0;
        else
            return d.height;
    }
    public AVLNode<se> rotateMyLeft(AVLNode focus){
        AVLNode<se> k=focus.left;
        focus.left=k.right;
        k.right=focus;
        focus.height=Math.max(height(focus.left), height(focus.right))+1;
        k.height=Math.max(height(k.left), height(k.right))+1;
        return k;
    }
    public AVLNode<se> rotateMyRight(AVLNode focus){
        AVLNode<se> k=focus.right;
        focus.right=k.left;
        k.left=focus;
        focus.height=Math.max(height(focus.left), height(focus.right))+1;
        k.height=Math.max(height(k.left), height(k.right))+1;
        return k;
    }
    
    
    
    public class AVLNode<se>{
        public int key;
        public se data;
        public AVLNode left;
        public AVLNode right;
        public int height=1;

        public AVLNode(se data,int key) {
            this.data=data;
            this.key=key;
            left=null;
            right=null;
            height=1;
        }
        
        
    }
    
    
}
