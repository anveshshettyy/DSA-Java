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
    static ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = null;
        ListNode curr = start;
        ListNode next = null;
        while(curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        while(curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if(count == k) {
            ListNode head2 = reverse(head, curr);
            head.next = reverseKGroup(curr, k);
            return head2;
        }
        return head;
    }
}