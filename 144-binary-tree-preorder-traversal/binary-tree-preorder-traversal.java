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
    static void preorder(TreeNode root, List<Integer> a) {
        if(root != null) {
            a.add(root.val);
            preorder(root.left, a);
            preorder(root.right, a);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList <Integer> a = new ArrayList<>();
        preorder(root, a);
        return a;
    }
}