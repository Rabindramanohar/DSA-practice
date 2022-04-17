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
    // in the fly adding node to ans TreeNode
    TreeNode curr;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        curr = ans;
        inorder(root);
        return ans.right;
    }
    public void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        node.left = null;
        curr.right = node;
        curr = node;
        inorder(node.right);
    }
}