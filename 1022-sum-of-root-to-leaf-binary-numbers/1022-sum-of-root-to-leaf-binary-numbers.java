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
 
     dfs(root, 0);
        return ans;
    }
    
    int ans = 0;
    void dfs(TreeNode root, int val){
        if(root == null) return;
        val = val << 1 | root.val;
        if(root.left == null && root.right == null) ans += val;
        dfs(root.left, val);
        dfs(root.right, val);
    }
 */
class Solution {
    int ans = 0;
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }
    public int helper(TreeNode root, int sum) {
        if(root == null) return 0;
        sum = (sum << 1) | root.val;
        if(root.left == null && root.right == null) {
            ans += sum;
        }
        helper(root.left, sum);
        helper(root.right, sum);
        
        return ans;
    }
}