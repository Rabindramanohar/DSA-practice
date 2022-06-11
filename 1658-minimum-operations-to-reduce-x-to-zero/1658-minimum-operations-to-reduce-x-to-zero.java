class Solution {
    public int minOperations(int[] nums, int x) {
        // sliding window with map
        int n = nums.length;
        if(n==1) return 1;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0, sum=0; i<n && sum <= x; i++) {
            hm.put(sum, i);
            sum += nums[i];
        }
        int ans = Integer.MAX_VALUE;
        for(int r=n-1, sum=0; r>=0 &&  sum<=x; r--) {
            if(hm.containsKey(x-sum))
                ans = Math.min(ans, n-r-1 + hm.get(x-sum));
            sum += nums[r];
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}