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
    public ListNode middleNode(ListNode head) {
        ListNode x = head;
        int length = 0;
        while(x != null) {
            length++;
            x = x.next;
        }
        x = head;
        length = length / 2;

        while(length != 0) {
            x = x.next;
            length--;
        }

        return x;


    }

    
    
}