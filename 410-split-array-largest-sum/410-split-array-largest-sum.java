
class Solution {
    //memoization T= O(n*n*m);
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] dp = new int[n+1][m+1];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        int[] prefixSum = new int[n+1];
        for(int i=0; i<n ;i++)
            prefixSum[i+1] = prefixSum[i] + nums[i];
        return minLargestSplitSum(prefixSum, 0, m, dp);
    }
    
    private int minLargestSplitSum(int[] arr, int idx, int m, int[][] dp) {
        int n = arr.length-1;
        if(dp[idx][m] != -1) return dp[idx][m];
        if(m==1)
            return arr[n]-arr[idx];
        int minSplitSum = (int)(1e9);
        for(int i=idx; i<=n-m; i++) {
            int first = arr[i+1]-arr[idx];
            int largestSplitSum = Math.max(first, minLargestSplitSum(arr, i+1, m-1, dp));
            minSplitSum = Math.min(minSplitSum, largestSplitSum);
            
            if(first >= minSplitSum)
                break;
        }
        return dp[idx][m] = minSplitSum;
    }
}