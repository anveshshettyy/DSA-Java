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
    ArrayList<Integer> nums = new ArrayList<>();
    void minDiff(TreeNode root) {
        if(root!=null) {
            minDiff(root.left);
            nums.add(root.val);
            minDiff(root.right);
        }
        return;
    }
    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        minDiff(root);
        for(int i=1; i<nums.size(); i++) {
            min = Math.min(min, (nums.get(i)-nums.get(i-1)));
        }
        return min;
    }
}