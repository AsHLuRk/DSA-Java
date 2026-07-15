/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkans(root.left , root.right);
    }

    public boolean checkans(TreeNode rootleft , TreeNode rootright){
      if(rootleft==null && rootright==null) return true;

      if(rootleft==null || rootright==null) return false;
     
      return (rootleft.val==rootright.val) && checkans(rootleft.left , rootright.right) && checkans(rootleft.right , rootright.left);

     
    }
}