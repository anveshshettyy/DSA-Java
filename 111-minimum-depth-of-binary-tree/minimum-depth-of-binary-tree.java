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
    public int minDepth(TreeNode root) {
        int h1 = 0, h2 = 0;
        if(root == null) return 0;
        h1 = minDepth(root.left);
        h2 = minDepth(root.right);
        if(root.left == null) return h2+=1;
        else if(root.right == null) return h1+=1;
        int min = Math.min(h1, h2);
        return min+1;
    }
}