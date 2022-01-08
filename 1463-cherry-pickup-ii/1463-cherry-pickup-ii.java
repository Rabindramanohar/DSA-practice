class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dpCache = new int[m][n][n];
        // initialize dpCache with unvisited as -1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    dpCache[i][j][k] = -1;
                }
            }
        }
        return dp(0, 0, n-1, grid, dpCache);
    }
    private int dp(int row, int col1, int col2, int[][] grid, int[][][] dpCache) {
        if(col1<0 || col1>=grid[0].length || col2<0 || col2>=grid[0].length) return 0;
        
        // checking cache here
        if(dpCache[row][col1][col2] != -1)
            return dpCache[row][col1][col2];
        //current cell
        int ans=0;
        ans += grid[row][col1];
        if(col1 != col2) ans += grid[row][col2];
        // transition
        if(row != grid.length-1) {
            int maxVal = 0;
            for(int i=col1-1; i<=col1+1; i++) {
                for(int j=col2-1; j<=col2+1; j++) {
                    maxVal = Math.max(maxVal, dp(row+1, i, j, grid, dpCache));
                }
            }
            ans += maxVal;
        }
        
        dpCache[row][col1][col2] = ans;
        return ans;
        
    }
}