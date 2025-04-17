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
    // TreeNode merge = null;   
    TreeNode preorder(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        TreeNode merge = new TreeNode(root1.val+root2.val);
        merge.left = preorder(root1.left, root2.left);
        merge.right = preorder(root1.right, root2.right);
        return merge;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return preorder(root1, root2);
    }
}