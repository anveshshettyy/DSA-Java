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
    TreeNode temp = null;
    TreeNode createHead(int val,TreeNode root) {
        if(head==null) {
            head = new TreeNode(val);
            temp = head;
        } 
        else {
            head.right = new TreeNode(val);
            head = head.right;
        }
        return head;
    }
    void inorder(TreeNode root) {
        if(root!=null) {
            inorder(root.left);
            head = createHead(root.val, head);
            inorder(root.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return temp;
    }
}