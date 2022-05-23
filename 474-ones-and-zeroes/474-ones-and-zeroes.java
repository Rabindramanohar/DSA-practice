class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        // bottom up
        int[][] dp = new int[m+1][n+1];
        for(String s : strs) {
            int[] cnt = count(s);
            for(int p=m; p>=cnt[0]; p--) {
                for(int q=n; q>=cnt[1]; q--) {
                    dp[p][q] = Math.max(dp[p-cnt[0]][q-cnt[1]] + 1, dp[p][q]);
                }
            }
        }
        return dp[m][n];
    }
    
    private int[] count(String s) {
        int[] cnt = new int[2];
        for(char c : s.toCharArray())
            cnt[c-'0']++;
        return cnt;
    }
}