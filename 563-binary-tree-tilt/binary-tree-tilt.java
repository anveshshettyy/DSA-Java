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
    int total = 0;
    int postorder(TreeNode root) {
        if(root==null) return 0;

        int left = postorder(root.left);
        int right = postorder(root.right);

        int tilt = Math.abs(left-right);
        total += tilt;

        return left+right+root.val;

    }
    public int findTilt(TreeNode root) {
        postorder(root);
        return total;
    }
}