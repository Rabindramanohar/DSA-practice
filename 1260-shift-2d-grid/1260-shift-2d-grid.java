class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        k %= (n*m);
        reverse(grid, 0, n*m-1);
        reverse(grid, 0, k-1);
        reverse(grid, k, n*m-1);
        List<List<Integer>> ans = new ArrayList<>();
        for(int[] row : grid)
            ans.add(Arrays.stream(row).boxed().collect(Collectors.toList()));
        return ans;
    }
    private void reverse(int[][] arr, int l, int h) {
        int n = arr.length, m = arr[0].length;
        while(l<h) {
            int r = l/m, c = l%m, i = h/m, j = h%m;
            int tmp = arr[r][c];
            arr[r][c] = arr[i][j];
            arr[i][j] = tmp;
            l++; h--;
        }
    }
}