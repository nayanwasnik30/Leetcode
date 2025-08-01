/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode start=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
            while(head != slow){
                 head=head.next;
                 slow=slow.next;
                 }
                 return slow;
            }
        }
        if(fast == null || fast.next == null) return null;
        return head;
    }
}