/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        
        Queue<Node> q = new LinkedList<>();
        Map<Node, Node> hm = new HashMap<>();
        q.add(node);
        hm.put(node, new Node(node.val));
        
        while(!q.isEmpty()) {
            Node curr = q.poll();
            for(Node ng : curr.neighbors) {
                if(!hm.containsKey(ng)) {
                    hm.put(ng, new Node(ng.val));
                    q.add(ng);
                }
                hm.get(curr).neighbors.add(hm.get(ng));
            }
        }
        return hm.get(node);
    }
}