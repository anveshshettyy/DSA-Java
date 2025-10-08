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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode node = head;
        ListNode res = new ListNode(0);
        ListNode dummy = res;

        while(node!=null) {
            if(node.val < x) li.add(node.val);
            node = node.next;
        } 

        node = head;

        while(node!=null) {
            if(node.val >= x) li.add(node.val);
            node = node.next;
        } 

        for(int i: li) {
            res.next = new ListNode(i);
            res = res.next;
        }

        System.out.println(li);
        return dummy.next;
    }
}