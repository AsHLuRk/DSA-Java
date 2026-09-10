class Solution {
    public int averageOfSubtree(TreeNode root) {
        return traverse(root); 
    }

    public int traverse(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Get subtree sum and count for the current node
        int[] stats = getSubtreeStats(node);
        int sum = stats[0];
        int count = stats[1];

        // Check if current node satisfies the condition
        int isMatch = (sum / count == node.val) ? 1 : 0;

        // Sum matches from current node + left subtree + right subtree
        return isMatch + traverse(node.left) + traverse(node.right);
    }

    // Helper to calculate total sum and node count for a subtree
    private int[] getSubtreeStats(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = getSubtreeStats(node.left);
        int[] right = getSubtreeStats(node.right);

        int sum = left[0] + right[0] + node.val;
        int count = left[1] + right[1] + 1;

        return new int[]{sum, count};
    }
}