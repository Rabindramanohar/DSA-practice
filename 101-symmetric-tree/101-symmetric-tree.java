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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || areMirror(root.left, root.right);
    }
    
    public boolean areMirror(TreeNode leftRoot, TreeNode rightRoot) {
        if(leftRoot == null || rightRoot == null) return leftRoot == rightRoot;
        if(leftRoot.val != rightRoot.val) return false;
            
        return areMirror(leftRoot.left, rightRoot.right) && areMirror(leftRoot.right, rightRoot.left);
    }
}