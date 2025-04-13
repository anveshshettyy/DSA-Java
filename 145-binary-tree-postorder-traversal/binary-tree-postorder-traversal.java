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
    static void postorder(TreeNode root, List<Integer> a) {
        if(root != null) {
            postorder(root.left, a);
            postorder(root.right, a);
            a.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList <Integer> a = new ArrayList <>();
        postorder(root, a);
        return a;
    }
}