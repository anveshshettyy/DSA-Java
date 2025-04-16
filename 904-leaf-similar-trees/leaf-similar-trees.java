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
    static void helper(TreeNode root, List <Integer> list) {
        if(root != null) {
            helper(root.left, list);
            if(root.left == null && root.right==null) list.add(root.val);
            helper(root.right, list);
        }
    } 
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        helper(root1, a);
        helper(root2, b);
        return a.equals(b) ? true : false;
    }
}