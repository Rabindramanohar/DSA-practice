class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(0, candidates, ans, target, new ArrayList<>());
        return ans;
    }
    public void combinations(int idx, int[] arr, List<List<Integer>> ans, int k, List<Integer> curr) {
        
        if(idx == arr.length) {
            if(k == 0) 
                ans.add(new ArrayList<>(curr));
            return;
        }
        
        if(arr[idx] <= k) {
            curr.add(arr[idx]);
            combinations(idx, arr, ans, k-arr[idx], curr);
            curr.remove(curr.size()-1);
        }
        combinations(idx+1, arr, ans, k, curr);
        
    }
}