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
    static int count(TreeNode root, int count) {
        if(root!=null) {
            count++;
            count = count(root.left, count);
            count = count(root.right, count);
        }
        return count;
    }
    public int countNodes(TreeNode root) {
        return count(root, 0);
    }
}