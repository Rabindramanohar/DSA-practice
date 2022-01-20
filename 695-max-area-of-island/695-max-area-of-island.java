class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j]==1 && !visited[i][j])
                    ans = Math.max(ans, dfs(grid, visited, i, j));
            }
        }
        return ans;
    }
    public int dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j] || grid[i][j]==0) 
            return 0;
        int count=0;
        visited[i][j]=true;
        int[] di = {-1, 0, 1, 0};
        int[] dj = {0, -1, 0, 1};
        
        for(int d=0; d<4; d++) {
            count += dfs(grid, visited, i+di[d], j+dj[d]);
        }
        
        return count+1;
    }
}