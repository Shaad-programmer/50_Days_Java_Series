//Build a Tree from its Preorder traversal
// public class day_42 {
//     static class Node {
//        int data;
//        Node left;
//        Node right;

//        Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//    static class BinaryTree {
//        static int idx = -1;
//        public static Node buildTree(int nodes[]) {
//            idx++;
//            if(nodes[idx] == -1) {
//                return null;
//            }
//            Node newNode = new Node(nodes[idx]); 
//            newNode.left = buildTree(nodes);
//            newNode.right = buildTree(nodes);
//            return newNode;
//        }
//    }
//    public static void main(String args[]) {
//        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        BinaryTree tree = new BinaryTree();      
//        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
//    }
// }

// Java Program to Check if One Binary Tree is a Subtree of Another
public class day_42 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left) &&
                   isIdentical(root.right, subRoot.right);
        }
        return false;
    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        System.out.println(isSubtree(root, subRoot));
    }
}