class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        combinations(0, candidates, ans, target, new ArrayList<>());
        return ans;
    }
    public void combinations(int idx, int[] arr, List<List<Integer>> ans, int k, List<Integer> curr) {
        if(k == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=idx; i<arr.length; i++) {
            
            if(i > idx && arr[i] == arr[i-1]) 
                continue;
            if(arr[i] > k)
                break;
            
            curr.add(arr[i]);
            combinations(i+1, arr, ans, k-arr[i], curr);
            curr.remove(curr.size()-1);
        }
    }
}