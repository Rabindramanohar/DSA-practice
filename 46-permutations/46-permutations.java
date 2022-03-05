class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(0, nums, ans);
        return ans;
    }
    
    private void generate(int idx, int[] arr, List<List<Integer>> ans) {
        if(idx == arr.length) {
            List<Integer> curr = new ArrayList<>();
            for(int i=0; i<arr.length; i++)
                curr.add(arr[i]);
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=idx; i<arr.length; i++) {
            swap(i, idx, arr);
            generate(idx+1, arr, ans);
            swap(i, idx, arr); // reswapping for backtracking
        }
    }
    
    private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}