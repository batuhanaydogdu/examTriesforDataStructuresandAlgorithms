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
public class AVLTree<se> {

    AVLNode root;

    public AVLTree() {
        root = null;
    }

    int height(AVLNode<se> d) {
        if (d == null) {
            return 0;
        } else {
            return d.height;
        }
    }

    public class AVLNode<se> {

        public int key;
        public se data;
        public AVLNode left;
        public AVLNode right;
        public int height = 1;

        public AVLNode(int key, se data) {
            this.key = key;
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 1;
        }

        public AVLNode<se> rotateMyLeft(AVLNode focus) {

            AVLNode k = focus.left;
            focus.left = k.right;
            k.right = focus.left;
            k.height = Math.max(height(k.right), height(k.left)) + 1;
            focus.height = Math.max(height(focus.left), height(focus.right)) + 1;
            return k;

        }

        public AVLNode<se> rotateMyRight(AVLNode focus) {
            AVLNode k = focus.right;
            focus.right = k.left;
            k.left = focus;
            k.height = Math.max(height(k.right), height(k.left)) + 1;
            focus.height = Math.max(height(focus.left), height(focus.right)) + 1;
            return k;

        }

        public AVLNode<se> doubleRotateLeftSide(AVLNode focus) {
            focus.left = rotateMyRight(focus.left);
            return rotateMyLeft(focus);
        }

        public AVLNode<se> doubleRotateRightSide(AVLNode focus) {
            focus.right = rotateMyLeft(focus.right);
            return rotateMyRight(focus);
        }

        public AVLNode<se> insert(AVLNode focus, se data, int key) {
            if (focus == null) {
                focus = new AVLNode(key, data);
            } else if (key < focus.key) {
                focus.left = insert(focus.left, data, key);
                if (height(focus.left) - height(focus.right) == 2) {
                    if (key < focus.left.key) {
                        focus = rotateMyLeft(focus);
                    } else {
                        focus = doubleRotateLeftSide(focus);
                    }
                }
            } else if (key > focus.key) {
                focus.right = insert(focus.right, data, key);
                if (height(focus.right) - height(focus.left) == 2) {
                    if (key > focus.right.key) {
                        focus = rotateMyRight(focus);
                    } else {
                        focus = doubleRotateRightSide(focus);
                    }
                }
            } else // key is equal to focus.key, update data
            {
                focus.data = data;
            }

            focus.height = Math.max(height(focus.left), height(focus.right)) + 1;
            return focus;

        }

    }
}




