class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        generatePermutes(ans, nums, new ArrayList<>(), vis);
        
        return ans;
    }
    
    public void generatePermutes(List<List<Integer>> ans, int[] arr, List<Integer> curr, boolean[] vis) {
        
        if(curr.size() == arr.length) {
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(vis[i] == true) continue;
            curr.add(arr[i]);
            vis[i] = true;
            generatePermutes(ans, arr, curr, vis);
            curr.remove(curr.size()-1);
            vis[i]=false;
        }
    }
}