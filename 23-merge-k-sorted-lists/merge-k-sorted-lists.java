/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        ArrayList<Integer> nums = new ArrayList<>();
        for (ListNode head : lists) {
            while (head != null) {
                nums.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(nums);
        
        ListNode res = new ListNode(0);
        ListNode curr = res;

        for(int i:nums) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        // System.out.println(nums);
        return res.next;
    }
}