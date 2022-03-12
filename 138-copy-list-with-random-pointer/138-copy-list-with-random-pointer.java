/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    Map<Node, Node> hm = new HashMap<>();
    public Node copyRandomList(Node head) {
        // brute force: T= O(N);
        Node newH = getCopy(head);
        for(Node key: hm.keySet()) {
            Node copy = hm.get(key);
            copy.random = hm.get(key.random);
        }
        return newH;
    }
    
    private Node getCopy(Node node) {
        if(node == null)
            return null;
        
        Node newH = new Node(node.val);
        newH.next = getCopy(node.next);
        hm.put(node, newH);
        
        return newH;
    }
}