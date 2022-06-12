class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int sum=0, i=0, j=0, n=nums.length, ans=0;
        while(i<n && j<n) {
            if(!hs.contains(nums[i])) {
                sum += nums[i];
                ans = Math.max(ans, sum);
                hs.add(nums[i++]);
            } else {
                sum -= nums[j];
                hs.remove(nums[j++]);
            }
        }
        return ans;
    }
}