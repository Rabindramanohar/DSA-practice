class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<Integer>(), subsets);
        return subsets;
    }
    
    public void generateSubsets(int[] arr, int idx, List<Integer> curr, List<List<Integer>> subsets) {
        
        subsets.add(new ArrayList<Integer>(curr));
        for(int i=idx; i<arr.length; i++) {
            curr.add(arr[i]);
            generateSubsets(arr, i+1, curr, subsets);
            curr.remove(curr.size()-1);
        }
    }
}