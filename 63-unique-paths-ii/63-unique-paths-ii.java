class Solution {
    // memoization
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return helper(n-1, m-1, obstacleGrid, dp);
    }
    private int helper(int i, int j, int[][] grid, int[][] dp) {
        // base cases:
        // System.out.println(grid[i][j]);
        if(i>=0 && j>=0 && grid[i][j] == 1) return 0;
        if(i<0 || j<0) return 0;
        if(i==0 && j==0) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        int up = helper(i-1, j, grid, dp);
        int left = helper(i, j-1, grid, dp);
        return dp[i][j] = up+left;
    }
}