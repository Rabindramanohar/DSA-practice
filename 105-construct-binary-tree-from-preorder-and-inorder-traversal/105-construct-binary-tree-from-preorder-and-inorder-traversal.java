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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, inorder.length-1, 0);
    }
    private TreeNode helper(int[] preorder, int[] inorder, int preStart, int inEnd, int inStart) {
        if(preStart >= preorder.length || inStart > inEnd) return null;
        
        TreeNode root = new TreeNode(preorder[preStart]);
        int i=0;
        for(; i<inorder.length-1; i++) {
            if(inorder[i] == root.val)
                break;
        }
        root.left = helper(preorder, inorder, preStart+1, i-1, inStart);
        root.right = helper(preorder, inorder, preStart+1+i-inStart, inEnd, i+1);
        return root;
    }
}