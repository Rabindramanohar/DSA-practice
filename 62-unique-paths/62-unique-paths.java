class Solution {
    // recursive
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        // for(int[] row: dp)
        //     Arrays.fill(row, -1);
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++)
                dp[i][j] = -1;
        }
        return helper(0, 0, m, n, dp);
    }
    public int helper(int i, int j, int n, int m, int[][] dp) {
        
        if(i >= n || j >= m) return 0;
        if(i == (n-1) && j == (m-1)) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = helper(i+1, j, n, m, dp) + helper(i, j+1, n, m, dp);
    }
}