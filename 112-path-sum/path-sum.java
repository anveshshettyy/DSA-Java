class Solution {
    static boolean sum(TreeNode root, int target, int sum) {
        if(root == null) return false;
        sum += root.val;
        if(sum == target && root.left == null && root.right == null) return true;
        boolean left = sum(root.left, target, sum);
        boolean right = sum(root.right, target, sum);
        return (right || left);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root, targetSum, 0);
    }
}