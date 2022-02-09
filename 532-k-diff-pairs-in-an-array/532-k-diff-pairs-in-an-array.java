class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<Integer> hs = new HashSet<>();
        
        for(int i=0; i<n; i++) {
            if(Arrays.binarySearch(nums, i+1, n, nums[i]+k) > 0)
                hs.add(nums[i]);
        }
        return hs.size();
    }
}