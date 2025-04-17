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
    int helper(TreeNode root, int rootVal) {
        if(root==null) return -1;

        if(root.val > rootVal) return root.val;
        int left = helper(root.left, rootVal);
        int right = helper(root.right, rootVal);

        if(left==-1) return right;
        if(right==-1) return left;

        return Math.min(left, right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        int rootValue = root.val;
        return helper(root, rootValue);
    }
}