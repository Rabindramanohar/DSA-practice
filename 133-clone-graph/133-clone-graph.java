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
        return cloneGraph(node, new HashMap<Node, Node>());
    }
    
    private Node cloneGraph(Node node, Map<Node, Node> hm) {
        if(node == null) return null;
        
        if(hm.containsKey(node))
            return hm.get(node);
        
        Node root = new Node(node.val);
        hm.put(node, root);
        for(Node ng : node.neighbors) {
            root.neighbors.add(cloneGraph(ng, hm));
        }
        return root;
    }
}





