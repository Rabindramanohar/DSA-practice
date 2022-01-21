/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        connectChild(root);
        return root;
    }
    private void connectChild(Node root) {
        if(root==null)
        return;
 
    LinkedList<Node> nodeQueue = new LinkedList<Node>();
    LinkedList<Integer> depthQueue = new LinkedList<Integer>();
 
    if(root!=null){
        nodeQueue.offer(root);
        depthQueue.offer(1);
    }
 
    while(!nodeQueue.isEmpty()){
        Node topNode = nodeQueue.poll();
        int depth = depthQueue.poll();
 
        if(depthQueue.isEmpty()){
            topNode.next = null;
        }else if(depthQueue.peek()>depth){
            topNode.next = null;
        }else{
            topNode.next = nodeQueue.peek();
        }
 
        if(topNode.left!=null){
            nodeQueue.offer(topNode.left);
            depthQueue.offer(depth+1);
        }
 
        if(topNode.right!=null){
            nodeQueue.offer(topNode.right);
            depthQueue.offer(depth+1);
        }        
    }
    }
}