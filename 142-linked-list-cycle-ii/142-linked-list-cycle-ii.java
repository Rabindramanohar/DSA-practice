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
        if(head == null) return null;
        Set<ListNode> hs = new HashSet<>();
        ListNode current = head;
        while(current.next != null) {
            if (hs.contains(current))
                return current;
            hs.add(current);
            current = current.next;
        }
        if(current == null) return null;
        
        return null;
    }
}