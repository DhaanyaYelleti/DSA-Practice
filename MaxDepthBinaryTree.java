public class MaxDepthBinaryTree {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Main method to calculate max depth
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    public static void main(String[] args) {
        // Constructing a sample binary tree:
        //         1
        //        / \
        //       2   3
        //      /
        //     4

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), null);
        root.right = new TreeNode(3);

        // Compute and print max depth
        int depth = maxDepth(root);
        System.out.println("Max Depth of the Tree: " + depth);
    }
}
