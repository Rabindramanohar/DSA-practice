class Solution {
    // memoization T = O(n*k)
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        int ans = helper(n-1, coins, amount, dp);
        if(ans >= (int)1e9) return -1;
        return ans;
    }
    private int helper(int idx, int[] arr, int k, int[][] dp) {
        // base cases:
        if(idx == 0) {
            if(k % arr[idx] == 0)
                return k/arr[idx];
            return (int)1e9;
        }
        
        if(dp[idx][k] != -1) return dp[idx][k];
        int notTaken = helper(idx-1, arr, k, dp);
        int taken = Integer.MAX_VALUE;
        if(arr[idx] <= k)
            taken = 1 + helper(idx, arr, k-arr[idx], dp);
        return dp[idx][k] = Math.min(taken, notTaken);
    }
}