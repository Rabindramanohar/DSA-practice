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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // creating the wrapperList
        List<List<Integer>> wrapperList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return wrapperList;
        queue.add(root);
        while(!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0; i<count; i++) {
                root = queue.remove();
                subList.add(root.val);
                if(root.left != null)
                    queue.add(root.left);
                if(root.right != null)
                    queue.add(root.right);
            }
            wrapperList.add(subList);
        }
        return wrapperList;
    }
}















