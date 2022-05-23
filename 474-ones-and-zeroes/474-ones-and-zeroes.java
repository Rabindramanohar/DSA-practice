class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        // memoization T = O(m*n);
        int[][][] dp = new int[m+1][n+1][strs.length];
        return helper(strs, m, n, 0, dp);
    }
    private int helper(String[] strs, int m, int n, int idx, int[][][] dp) {
        // base cases:
        if(idx == strs.length || m+n == 0) return 0;
        
        if(dp[m][n][idx] > 0) return dp[m][n][idx];
        int[] cnt = count(strs[idx]);
        int taken = 0;
        if(m >= cnt[0] && n >= cnt[1])
            taken = 1 + helper(strs, m-cnt[0], n-cnt[1], idx+1, dp);
        int notTaken = 0 + helper(strs, m, n, idx+1, dp);
        
        return dp[m][n][idx] = Math.max(taken, notTaken);
    }
    
    private int[] count(String s) {
        int[] cnt = new int[2];
        for(char c : s.toCharArray())
            cnt[c-'0']++;
        return cnt;
    }
}