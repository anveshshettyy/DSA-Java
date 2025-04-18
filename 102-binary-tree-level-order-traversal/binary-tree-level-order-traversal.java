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
    ArrayList<List<Integer>> res = new ArrayList<>();
    void BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int lvlSize = queue.size();
            List <Integer> lvl = new ArrayList<>();
            for(int i=0; i<lvlSize; i++) {
                TreeNode currNode = queue.poll();
                lvl.add(currNode.val);

                if (currNode.left != null) queue.add(currNode.left);
                if (currNode.right != null) queue.add(currNode.right);
            }
            res.add(lvl);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return res;
        BFS(root);
        return res;
    }
}