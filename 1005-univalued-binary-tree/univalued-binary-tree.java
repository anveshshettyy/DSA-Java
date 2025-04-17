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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return false;
        int temp = root.val;
        return helper(root, temp);
    }

    boolean helper(TreeNode root, int temp) {
        if(root==null) return true;
        if(root.val != temp) return false;
        boolean left = helper(root.left, temp);
        boolean right = helper(root.right, temp);

        return(left && right);
    }
}