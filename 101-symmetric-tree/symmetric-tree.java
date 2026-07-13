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
        
       if(root == null){
        return true;
       }

       TreeNode left = root.left;
       TreeNode right = root.right;

       List<Integer> list1 = new ArrayList<>();
       List<Integer> list2 = new ArrayList<>();
       getList(left, list1);
       getListright(right, list2);
       System.out.println(list1);
        System.out.println(list2);
       return list1.equals(list2);
    }
    public void getList(TreeNode node, List<Integer> list){

        if(node==null){
            list.add(101);
            return;
        }
        list.add(node.val);
        getList(node.left, list);
        getList(node.right, list);
    }
    public void getListright(TreeNode node, List<Integer> list){

        if(node==null){
            list.add(101);
            return;
        }
        list.add(node.val);
        getListright(node.right, list);
        getListright(node.left, list);
    }
}