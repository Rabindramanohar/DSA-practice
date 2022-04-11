class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int start = n*m - k % (n*m);
        LinkedList<List<Integer>> ans = new LinkedList<>();
        for(int i=start; i<n*m + start; i++) {
            int j = i%(n*m), r = j/m, c = j%m;
            if((i-start)%m == 0)
                ans.add(new ArrayList<>());
            ans.peekLast().add(grid[r][c]);
        }
        return ans;
    }
}