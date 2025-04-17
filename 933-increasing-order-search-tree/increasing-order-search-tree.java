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
    TreeNode head=null;
    ArrayList<Integer> nums = new ArrayList<>();
    void inorder(TreeNode root) {
        if(root!=null) {
            inorder(root.left);
            nums.add(root.val);
            inorder(root.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        if(head==null) head = new TreeNode(nums.get(0));
        TreeNode temp = head;
        for(int i=1; i<nums.size(); i++) {
            head.right = new TreeNode(nums.get(i));
            head = head.right;
        }
        return temp;
    }
}