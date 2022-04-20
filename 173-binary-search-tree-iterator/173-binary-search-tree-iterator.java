/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    // brute force T = O(n),  S = O(n)
    ArrayList<Integer> list = new ArrayList<>();
    int i=0;
    public BSTIterator(TreeNode root) {
        list = new ArrayList<Integer>();
        inorder(root, list);
    }
    
    public int next() {
        int ans = list.get(i);
        i++;
        return ans;
    }
    
    public boolean hasNext() {
        if(i >= list.size()) return false;
        return true;
    }
    
    private void inorder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */