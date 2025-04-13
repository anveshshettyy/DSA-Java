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
    static void Inorder(TreeNode root, List<Integer> a) {
        if(root != null) {
            Inorder(root.left, a);
            a.add(root.val);
            Inorder(root.right, a);
        }
    } 
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList <Integer> a = new ArrayList <>();
        Inorder(root,a);
        return a;            
    }
}