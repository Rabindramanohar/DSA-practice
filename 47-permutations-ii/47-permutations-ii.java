class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        helper(nums, ans, new boolean[n], new LinkedList<>());
        return ans;
    }
    private void helper(int[] arr, List<List<Integer>> ans, boolean[] vis, LinkedList<Integer> curr) {
        if(curr.size() == arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(vis[i]) continue;
            if(i>0 && arr[i] == arr[i-1] && !vis[i-1]) continue;
            curr.add(arr[i]);
            vis[i] = true;
            helper(arr, ans, vis, curr);
            curr.removeLast();
            vis[i] = false;
        }
    }
}