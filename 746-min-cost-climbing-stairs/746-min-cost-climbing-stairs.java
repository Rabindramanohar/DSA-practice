class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        return Math.min(helper(cost, n-1, dp), helper(cost, n-2, dp));
    }
    private int helper(int[] cost, int n, int[] dp) {
        if(n < 0) return 0;
        
        if(n==0 || n == 1) return cost[n];
        if(dp[n] != 0) return dp[n];
        return dp[n] = cost[n] + Math.min(helper(cost, n-1, dp), helper(cost, n-2, dp));
    }
}