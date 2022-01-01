class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int ar[] = new int[n + 2];
        ar[0] = ar[n+1] = 1;
        for(int i=1; i<=n; i++) {
            ar[i] = nums[i-1];
        }
        int memo[][] = new int[n+2][n+2];
        return burstBalloons(memo, ar, 0, n+1);
    }
    
    public int burstBalloons(int memo[][], int ar[], int left, int right) {
        if(left+1 == right) return 0;
        if(memo[left][right]>0) return memo[left][right];
        int ans = 0;
        for(int i=left+1; i<right; i++) {
            ans = Math.max(ans, ar[left]*ar[i]*ar[right] + burstBalloons(memo, ar, left, i) +             burstBalloons(memo, ar, i, right));
        }
        memo[left][right] = ans;
        return ans;
    }
}