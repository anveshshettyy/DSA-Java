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
    Queue <Integer> queue = new LinkedList<>();
    public void leaf(TreeNode root, List <Integer> list) {
        if(root!=null) {
            leaf(root.left, list);
            if(root.left==null && root.right==null) list.add(root.val);
            leaf(root.right, list);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        leaf(root1, l1);
        leaf(root2, l2);
        return l1.equals(l2);
    } 
}