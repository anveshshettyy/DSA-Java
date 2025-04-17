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
    HashMap <Integer, Integer> hm = new HashMap<>();
    void inorder(TreeNode root) {
        if(root!=null) {
            inorder(root.left);

            if(hm.get(root.val) != null) 
                hm.put(root.val,hm.get(root.val)+1);
            else 
                hm.put(root.val,1);
            
            inorder(root.right);
        }
    }
    public int[] findMode(TreeNode root) {
        
        inorder(root);
        int max = 0, maxElem = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            System.out.println("Frequency of "+e.getKey()+" is: "+e.getValue());
            if(e.getValue() > max) {
                max = e.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if(e.getValue() == max) {
                nums.add(e.getKey());
            }
        }
        int arr[] = new int[nums.size()];
        for(int i=0; i<nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        return arr;
    }
}