class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, new boolean[nums.length], new ArrayList<>());
        return ans;
    }
        private void helper(int[] arr, List<List<Integer>> ans, boolean[] vis, List<Integer> curr) {
        if(curr.size() == arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(vis[i])
                continue;
            if(i>0 && arr[i] == arr[i-1] && !vis[i-1])
                continue;
            curr.add(arr[i]);
            vis[i] = true;
            helper(arr, ans, vis, curr); // recursively add arr element to curr ds
            curr.remove(curr.size()-1); // backtracking so need to remove the ele from curr ds and unmark the vis 
            vis[i] = false;
        }
    }
}