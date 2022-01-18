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
        ListNode current = head;
        int count = 0;
        while(current.next != null) {
            count++;
            current = current.next;
        }
        // if(count == n) {
        //     head = head.next;
        //     return head;
        // }
        int k = count-n+1;
        current = head;
        ListNode prev = null;
        while(k-- != 0) {
            prev = current;
            current = current.next;
        }
        
        if(prev != null) {
            prev.next = current.next;
            // current.next = null;
        } else 
            return head.next;
        
        return head; 
    }
}