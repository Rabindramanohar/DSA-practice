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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        int li=0;
        int size = getSize(head);
        int ri = size;
        while(li < ri) {
            ListNode left = getListNodeAt(li, head);
            ListNode right = getListNodeAt(ri, head);
            int tmp = left.val;
            left.val = right.val;
            right.val = tmp;
            li++;
            ri--;
        }
        return head;
    }
    
    public ListNode getListNodeAt(int idx, ListNode head) {
        ListNode tmp = head;
        for(int i=0; i<idx; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }
    public int getSize(ListNode head) {
        int cnt = 0;
        ListNode current = head;
        while(current.next != null) {
            cnt++;
            current = current.next;
        }
        return cnt;
    }
}