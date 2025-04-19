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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode res = null;
        ListNode temp = head;

        while(head != null) {
            if(res==null) {
                res = head;
                temp = res;
            }
            else if(res.val != head.val) {
                res.next = head;
                res = res.next;
            }
            head = head.next;
        }
        res.next = null;
        return temp;
    }
}