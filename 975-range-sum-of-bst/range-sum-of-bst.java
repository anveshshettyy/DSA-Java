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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Inorder(root);
        int sum = 0;
        for(int i:list) {
            if(i>=low && i<=high) sum+= i;
        }
        return sum;
    }
}