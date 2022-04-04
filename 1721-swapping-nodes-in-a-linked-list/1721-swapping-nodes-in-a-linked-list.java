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
        ListNode n1=head, n2=head, curr=head;
        int cnt = 1;
        
        while(curr != null) {
            if(cnt < k) n1 = n1.next;
            else if(cnt > k) n2 = n2.next;
            cnt++;
            curr = curr.next;
        }
        int tmp = n1.val;
        n1.val = n2.val;
        n2.val = tmp;
        
        return head;
    }
}