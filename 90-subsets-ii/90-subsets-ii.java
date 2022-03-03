class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subsets(0, nums, ans, new ArrayList<>());
        return ans;
    }
    
    private void subsets(int idx, int[] arr, List<List<Integer>> ans, List<Integer> curr) {
        ans.add(new ArrayList<>(curr));
        for(int i=idx; i<arr.length; i++) {
            if(i != idx && arr[i] == arr[i-1]) continue;
            curr.add(arr[i]);
            subsets(i+1, arr, ans, curr);
            curr.remove(curr.size()-1);
        }
    }
}