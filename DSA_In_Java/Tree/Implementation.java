
//package DSA In Java.Tree;
import java.util.*;

import javax.swing.tree.TreeNode;

public class Implementation {

    public static class Node {
        int data;
        Node left, right;

        public Node(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        Node root;

        public void insert(int value) {
            Node newNode = new Node(value);
            if (root == null) {
                root = newNode;
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node temp = queue.poll();
                if (temp.left == null) {
                    temp.left = newNode;
                    break;
                } else {
                    queue.add(temp.left);
                }
                if (temp.right == null) {
                    temp.right = newNode;
                    break;
                } else {
                    queue.add(temp.right);
                }
            }
        }

        // Inorder Traversal (Left, Root, Right)
        public void inorder(Node node) {
            if (node == null)
                return;
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }

        // Level Order Traversal
        public void leveOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node front = q.remove();
                System.out.print(front.data + " ");
                if (front.left != null)
                    q.add(front.left);
                if (front.right != null)
                    q.add(front.right);
            }
        }

        // Preorder Traversal (Root, Left, Right)
        public void preorder(Node node) {
            if (node == null)
                return;
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }

        // Postorder Traversal (Left, Right, Root)
        public void postorder(Node node) {
            if (node == null)
                return;
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }

        // Search for a value in the tree
        public boolean search(Node node, int key) {
            if (node == null)
                return false;
            if (node.data == key)
                return true;
            return search(node.left, key) || search(node.right, key);
        }

        public int size(Node root) { // size of tree
            if (root == null)
                return 0;
            return 1 + size(root.left) + size(root.right);
        }

        public int height() { // size of height
            return level(root) - 1;
        }

        public int sum(Node root) { // Sum of all tree node is
            if (root == null)
                return 0;
            return root.data + sum(root.left) + sum(root.right);
        }

        public int max(Node root) { // Max in tree node
            if (root == null)
                return 0;
            return Math.max(root.data, Math.max(max(root.right), max(root.left)));
        }

        public int min(Node root) // Min in tree node
        {
            if (root == null)
                return Integer.MAX_VALUE;
            return Math.min(root.data, Math.min(min(root.left), min(root.right)));
        }


        public int level(Node root) // level of tree node
        {
            if (root == null)
                return 0;
            int left = level(root.left);
            int right = level(root.right);
            if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
                return -1;
            }
            return 1 + Math.max(left, right);

        }

        public boolean isBalanced(Node root) { // Balanced Binary Tree
            return level(root) >= 0;
        }
        static int maxDiameter;
        public int diameter(Node root)   /// Diameter of a Tree
        {
            maxDiameter = 0; 
            calculateHeight(root);
            return maxDiameter;
        }

        private int calculateHeight(Node node) {
            if (node == null)
                return 0;
            int leftHeight = calculateHeight(node.left);
            int rightHeight = calculateHeight(node.right);
            maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 10
        // / \
        // 20 30
        // / \
        // 40 50
        // Insert nodes
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        // Traversals
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Lever order Traversal : ");
        tree.leveOrder(tree.root);
        System.out.println();

        // System.out.print("Preorder Traversal: ");
        // tree.preorder(tree.root);
        // System.out.println();

        // System.out.print("Postorder Traversal: ");
        // tree.postorder(tree.root);
        // System.out.println();

        // System.err.println("Size of Tree is : " + tree.size(tree.root));
        // System.out.println("heigth of tree is : " + tree.height());

        // System.out.println("Sum of tree node is : " + tree.sum(tree.root));
        // System.out.println("Max in tree is : " + tree.max(tree.root));
        // System.err.println("Min in tree is : " + tree.min(tree.root));
        //System.out.println("Level of tree is : " + tree.level(tree.root));
        //System.out.println("Tree are Balance or not : " + tree.isBalanced(tree.root));
        System.out.println("Diameter of Tree : " +tree.diameter(tree.root));

        // Search
        // int searchKey = 30;
        // System.out.println("Search " + searchKey + ": " + (tree.search(tree.root,
        // searchKey) ? "Found" : "Not Found"));
    }

}
