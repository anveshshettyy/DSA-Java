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
    TreeNode prev = null;
     int minDiff = Integer.MAX_VALUE;

    void minDiff(TreeNode root) {
        if(root!=null) {
            minDiff(root.left);
            if(prev == null) prev = root;
            else {
                minDiff = Math.min(minDiff, (root.val - prev.val));
                System.out.print(root.val+" ");
                System.out.print(prev.val+" ");
                System.out.print(minDiff+" ");
                prev = root;
                
            }
            minDiff(root.right);
        }
        return;
    }
    public int minDiffInBST(TreeNode root) {
        minDiff(root);
        return minDiff;
    }
}