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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode n1=null, n2=null, curr=head;
        while(curr != null) {
            n2 = n2==null ? null : n2.next;
            if(--k == 0) {
                n1 = curr;
                n2 = head;
            }
            curr = curr.next;
        }
        int tmp = n1.val;
        n1.val = n2.val;
        n2.val = tmp;
        
        return head;
    }
}