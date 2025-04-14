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
    List <Integer> a = new ArrayList <>();
    void dfs(TreeNode root, int depth) {
        if(root == null) return;

        if(depth == a.size()) a.add(root.val);

        dfs(root.right, depth + 1);
        dfs(root.left, depth + 1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return a;
    }
}