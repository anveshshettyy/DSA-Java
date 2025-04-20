
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode temp1 = head;
        ListNode temp2 = null;
        int len = 0;
        while (temp1 != null) {
            len++;
            temp1 = temp1.next;
        }

        k = k % len;
        if (k == 0) return head;

        int index = len - k -1;
        temp1 = head;
        for (int i = 0; i < index; i++) {
            temp1 = temp1.next;
        }
        temp2 = temp1.next;
        temp1.next = null;
        ListNode res = temp2;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = head;
        return res;
    }
}