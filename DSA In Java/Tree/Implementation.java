//package DSA In Java.Tree;
import java.util.*;
public class Implementation {

    static class  Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }  
    }

    public static class BinaryTree {
        static int idx = -1;
        public Node bulidTree(int node[]) {
            idx++;
            if (idx >= node.length || node[idx] == -1) {
                return null;
            }


            Node newNode = new Node(node[idx]);
            newNode.left = bulidTree(node);
            newNode.right = bulidTree(node);

            return newNode;
        }
        
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static void postorder(Node root) {
        if(root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root) {
        if(root == null) return;
        Queue<Node> a = new LinkedList<>();
        a.add(root);
        a.add(null);
        while (!a.isEmpty()) {
            Node currNode = a.remove();
            if(currNode == null) {
                System.out.println();
                if(a.isEmpty()) {
                    break;
                }else{
                    a.add(null);
                }
            }else{
                System.out.print(currNode.data+ " ");
                if(currNode.left != null) {
                    a.add(currNode.left);
                }
                if(currNode.right != null) {
                    a.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int node[] = {2,3,4,5,4,-1,-1,3,4,-1,4,5,6,-1,-1,4,6,8};
        BinaryTree tree = new BinaryTree();
        Node root = tree.bulidTree(node);
        //System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        levelOrder(root);
        
    }
}
