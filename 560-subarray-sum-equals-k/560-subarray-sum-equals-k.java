class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0, n = nums.length;
        int[] sum = new int[n+1];
        sum[0] = 0;
        for(int i=1; i<=n; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }
        for(int s=0; s<n; s++) {
            for(int e=s+1; e<=n; e++) {
                if(sum[e]-sum[s] == k)
                    cnt++;
            }
        }
        return cnt;
    }
}