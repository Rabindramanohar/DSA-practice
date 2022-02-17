class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findSum(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public void findSum(int idx, int[] arr, int k, List<List<Integer>> ans, List<Integer> ds) {
        
        if(idx == arr.length) {
            if(k == 0)
                ans.add(new ArrayList<>(ds));
            return;
        }
        
        if(arr[idx] <= k) {
            ds.add(arr[idx]);
            findSum(idx, arr, k-arr[idx], ans, ds);
            ds.remove(ds.size()-1);
        }
        
        findSum(idx+1, arr, k, ans, ds);
    }
}