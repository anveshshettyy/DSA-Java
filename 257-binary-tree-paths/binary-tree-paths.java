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
    static void dfs(TreeNode root, String s, List<String> res) {
        if(root == null) return;
        s += root.val;

        if(root.left == null && root.right == null) {
            res.add(s);
        } else {
            s += "->";
            dfs(root.left, s, res);
            dfs(root.right, s, res);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
    }
}