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
    static int sum(TreeNode root, int currSum) {
        if(root==null) return 0;

        currSum = (currSum << 1) | root.val;

        if(root.right == null && root.left == null) return currSum;

        return(sum(root.left, currSum) + sum(root.right, currSum));
    }
    public int sumRootToLeaf(TreeNode root) {
        return sum(root, 0);
    }
}