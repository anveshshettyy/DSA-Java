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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode dummy = res;
        ArrayList<Integer> list = new ArrayList<>();
        while(list1!=null) {
            list.add(list1.val);
            list1 = list1.next;
        }

        while(list2!=null) {
            list.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list);

        for(int i=0; i<list.size(); i++) {
            res.next = new ListNode(list.get(i));
            res = res.next;
        }

        return dummy.next;
    }
}