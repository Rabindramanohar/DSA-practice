class Solution {
    Integer[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new Integer[triangle.size()][triangle.size()];
        return helper(triangle, 0, 0);
    }
    
    // Map<String, Integer> hm = new HashMap<>();
    
    private int helper(List<List<Integer>> list, int i, int j) {
        if(i >= list.size()) return 0;
        
        // String key = i + "|" + j;
        if(dp[i][j] == null) {
            dp[i][j] = Math.min(helper(list, i+1, j), helper(list, i+1, j+1)) + list.get(i).get(j);
        }
        return dp[i][j];
    }
}