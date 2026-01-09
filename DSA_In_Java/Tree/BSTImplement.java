public class BSTImplement {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            return new Node(val);
        }

        if(val < root.data) {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    static boolean serach(Node root, int val) {
        if(root == null) {
            return false;
        }
        if(root.data == val) {
            return true;
        }
        if(root.data > val ) {
            return serach(root.left, val);
        }else{
            return serach(root.right, val);
        }
    }

    static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node buildBST(int arr[]) {
        Node root = null;
        for(int val : arr) {
            root = insert(root,val);
        }

        return root;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,5,4,6};
        Node root = buildBST(arr);
        inorder(root);
        System.out.println();
        System.out.println(serach(root, 1));
        
    }
}
