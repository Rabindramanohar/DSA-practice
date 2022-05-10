class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1, k, n, new LinkedList<Integer>(), ans);
        return ans;
    }
    private void helper(int start, int k, int n, LinkedList<Integer> curr, List<List<Integer>> ans) {
        // base cases:
        if(k<0 || n<0) return;
        if(k==0 && n==0) {
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        
        
        for(int i=start; i<=9; i++) {
            curr.add(i);
            helper(i+1, k-1, n-i, curr, ans);
            curr.removeLast();
        }
    }
}