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
 *      -    this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // static int sum(TreeNode root, int sum) {
    //     if(root.left == null && root.right == null) 
    //         return sum+=root.val;
    
    //     int left = sum(root.left,sum);
    //     int right = sum(root.right, sum);
    //     return (left + right);
    // }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;

        int sum = 0;

        if(root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}