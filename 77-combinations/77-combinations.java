class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(1, n, new ArrayList<Integer>(), subsets, k);
        
        return subsets;
    }
    
    public void generateSubsets(int idx, int n, List<Integer> curr, List<List<Integer>>subsets, int k) {
        
        if(curr.size() == k) {
            subsets.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=idx; i<=n; i++) {
            curr.add(i);
            generateSubsets(i+1, n, curr, subsets, k);
            curr.remove(curr.size()-1);
        }
    }
}