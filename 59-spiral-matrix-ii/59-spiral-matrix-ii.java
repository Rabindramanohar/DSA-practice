class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int cnt=1;
        for(int l=0; l<(n+1)/2; l++) {
            // left-> right
            for(int p=l; p<n-l; p++)
                ans[l][p] = cnt++;
            // top->bottom
            for(int p=l+1; p<n-l; p++)
                ans[p][n-l-1] = cnt++;
            // right -> left
            for(int p=l+1; p<n-l; p++)
                ans[n-l-1][n-p-1] = cnt++;
            // bottom -> top
            for(int p=l+1; p<n-l-1; p++)
                ans[n-p-1][l] = cnt++;
        }
        return ans;
    }
}