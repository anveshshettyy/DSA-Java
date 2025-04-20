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
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        while(head!=null) {
            hm.put(head.val, hm.getOrDefault(head.val, 0)+1);
            head = head.next;
        }

        ListNode res = null;
        ListNode ans = null;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() == 1) {
                if(res==null){
                    res = new ListNode(entry.getKey());
                    ans = res;
                } 
                else {
                    res.next = new ListNode(entry.getKey());
                    res = res.next;
                }    
            }
        }

        return ans;
    }
}