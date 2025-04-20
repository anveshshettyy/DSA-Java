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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        int len = 0;
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp1 != null) {
            len++;
            temp1 = temp1.next;
        }

        if(len == n) return head.next;
        int index = len - n  - 1;
        len = 0;
        for(int i=0; i<index; i++) {
            temp2 = temp2.next;
        }

        if(temp2.next!=null || temp2.next.next!=null)
            temp2.next = temp2.next.next;

        return head;
    }
}