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
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode res = null;
        ListNode ans = null;

        if (list1.val < list2.val) {
            res = list1;
            ans = res;
            list1 = list1.next;
        } else {
            res = list2;
            list2 = list2.next;
            ans = res;
        }
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                res.next = list1;
                list1 = list1.next;
            } else {
                res.next = list2;
                list2 = list2.next;
            }
            res = res.next;
        }

        if (list1 != null) {
            res.next = list1;
        } else {
            res.next = list2;
        }
        return ans;
    }
}