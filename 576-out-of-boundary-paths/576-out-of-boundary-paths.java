class Solution {
    int mod = 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove+1];
        for(int[][] ele : dp)
            for(int[] e : ele)
                Arrays.fill(e, -1);
        return helper(m, n, maxMove, startRow, startColumn, dp);
    }
    private int helper(int m, int n, int N, int i, int j, int[][][] dp) {
        if (i == m || j == n || i < 0 || j < 0) return 1;
        if (N == 0) return 0;
        if (dp[i][j][N] >= 0) return dp[i][j][N];
        dp[i][j][N] = ((helper(m, n, N-1, i-1, j, dp) + helper(m, n, N-1, i+1, j, dp)) % mod 
                       + (helper(m, n, N-1, i, j-1, dp) + helper(m, n, N-1, i, j+1, dp)) % mod) % mod;
        return dp[i][j][N];
    }
}