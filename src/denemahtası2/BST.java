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
public class BST {

    private Node root;

    public BST() {
    }

    public void addNode(int key, String nm) {
        Node n = new Node(key, nm);

        if (root == null) {
            root = n;
        } else {
            Node tmp = root;
            Node parent = root;

            while (tmp != null) {
                parent = tmp;
                if (key > parent.key) {
                    tmp = tmp.right;
                } else if (key < parent.key) {
                    tmp = tmp.left;
                }

            }
            if (parent.key > n.key) {
                parent.left = n;
            } else if (parent.key < n.key) {
                parent.right = n;
            }

        }
    }

    public void traverseInOrder(Node focus) {

        if (focus.left != null) {
            traverseInOrder(focus.left);
        }
        System.out.println(focus.toString());
        if (focus.right != null) {
            traverseInOrder(focus.right);
        }

    }

    public void traversePostOrder(Node focus) {

        if (focus.left != null) {
            traversePostOrder(focus.left);
        }
        if (focus.right != null) {
            traversePostOrder(focus.right);
        }
        System.out.println(focus.toString());

    }

    public void traversePreOrder(Node focus) {
        System.out.println(focus.toString());
        if (focus.left != null) {
            traversePreOrder(focus.left);
        }
        if (focus.right != null) {
            traversePreOrder(focus.right);
        }

    }

    public Node minSearch(Node focus) {
        if (focus.left != null) {
            return minSearch(focus.left);
        }
        return focus;
    }

    public Node search(int key) {
        Node focus = root;
        while (focus != null) {
            if (focus.key < key) {
                focus = focus.right;
            } else if (focus.key > key) {
                focus = focus.left;
            } else {
                return focus;
            }
        }
        return null;
    }

    public Node searchRecursive(Node focus, int key) {
        if (focus == null) {
            return null;
        }
        if (focus.key == key) {
            return focus;
        } else if (focus.right.key > key) {
            return searchRecursive(focus.left, key);
        } else {
            return searchRecursive(focus.right, key);
        }

    }

    public int size(Node focus) {
        if (focus == null) {
            return 0;
        }
        return size(focus.left) + 1 + size(focus.right);

    }

//    public void deleteMin(Node focus) {
//        Node parent = focus;
//        while (focus.left != null) {
//            parent = focus;
//            focus = focus.left;
//        }
//
//        if (focus == root) {
//            root = focus.right;
//        }
//
//        parent.left = null;
//
//    }
    private void deleteMin(Node focus) {
        if (focus == null || root == null) {
            return;
        }
        Node parent = null;
        while (focus.left != null) {
            parent = focus;
            focus = focus.left;
        }

        if (focus == root) {
            root = focus.right;
        }

        parent.left = focus.right;

    }

    public Node deleteMinRecursive(Node focus) {
        if (focus.left == null) {
            return focus.right;
        }
        focus.left = deleteMinRecursive(focus.left);

        return focus;
    }

    public Node delete2(Node focus, int key) {

        if (focus == null) {
            return null;
        }
        if (key < focus.key) {
            focus.left = delete2(focus.left, key);
        } else if (key > focus.key) {
            focus.right = delete2(focus.right, key);
        } else {
            if (focus.right == null) {
                return focus.left;
            }
            if (focus.left == null) {
                return focus.right;
            }
            Node t = focus;
            focus = minSearch(t.right);
            focus.right = deleteMinRecursive(t.right);
            focus.left = t.left;
        }

        return focus;
    }

    public int sum(Node focus) {
        if (focus == null) {
            return 0;
        } else {
            return (sum(focus.left) + focus.key + sum(focus.right));
        }
    }

    public int maxDepth(Node focus) {
        if (focus == null) {
            return 0;
        } else {
            int rDepth = maxDepth(focus.right);
            int lDepth = maxDepth(focus.left);
            if (rDepth > lDepth) {
                return rDepth + 1;
            } else {
                return lDepth + 1;
            }
        }

    }

    public void traverseLevelOrder(Node focus) {
        Queue<Node> que = new Queue();
        que.enqueue(focus);
        while (!que.isEmpty()) {
            Node d = que.dequeue();
            if (d.right != null) {
                que.enqueue(d.right);
            }
            if (d.left != null) {
                que.enqueue(d.left);
            }
            System.out.println(d);
        }
    }
    
    public int nonWtc(Node focus){
        if(focus!=null){
            if(focus.left!=null&focus.right!=null){
                return 1+nonWtc(focus.left)+nonWtc(focus.right);
            }
        }
        return 0;
    }

    public class Node {

        int key;
        String s;
        Node left = null;
        Node right = null;

        public Node(int key, String s) {
            this.key = key;
            this.s = s;
        }

        @Override
        public String toString() {
            return ("Node(k= " + key + " name=  " + s + ")");
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.addNode(50, "a");
        bst.addNode(25, "");
        bst.addNode(10, "");
        bst.addNode(35, "");
        bst.addNode(75, "");
        bst.addNode(60, "");
        bst.addNode(95, "");
        bst.addNode(5, "");
        bst.addNode(12, "");
        bst.addNode(7, "");
        bst.addNode(17, "");
        bst.addNode(38, "");
//        bst.traverseInOrder(bst.root);
//        System.out.println("");
//        bst.traversePostOrder(bst.root);
//        System.out.println("");
//        bst.traversePreOrder(bst.root);
//        System.out.println("");
//        System.out.println(bst.minSearch(bst.root));
//        System.out.println(25);
//        System.out.println(bst.search(25).left);
//        System.out.println(bst.searchRecursive(bst.root, 25).left);
//        System.out.println(bst.size(bst.root));
//
//        bst.traverseInOrder(bst.root);
//                System.out.println(bst.sum(bst.root));
//
//        bst.delete2(bst.root, 60);
//        System.out.println("");
//        bst.traverseInOrder(bst.root);
//        System.out.println(bst.sum(bst.root));

        System.out.println(bst.nonWtc(bst.root));
    }
}
