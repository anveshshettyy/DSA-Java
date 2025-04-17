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
    ArrayList <Integer> nums = new ArrayList<>();
    void inorder(TreeNode root) {
        if(root!=null) {
            inorder(root.left);
            nums.add(root.val);
            inorder(root.right);
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int left = 0, right = nums.size() - 1;
        while(left < right) {
            int sum = nums.get(left) + nums.get(right);
            if(sum == k) return true;
            else if(sum < k) left++;
            else right--;
        }
        return false;
    }
}