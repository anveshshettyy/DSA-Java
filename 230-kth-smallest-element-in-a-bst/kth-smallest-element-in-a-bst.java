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
    ArrayList<Integer> list = new ArrayList<>();
    void Inorder(TreeNode root) {
        if(root!=null) {
            Inorder(root.left);
            list.add(root.val);
            Inorder(root.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        Inorder(root);
        return list.get(k-1);
    }
}