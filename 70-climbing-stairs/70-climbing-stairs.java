class Solution {
    public int climbStairs(int n) {
        int[] cntStairs = new int[n+1];
        cntStairs[0] = 1;
        cntStairs[1] = 1;
        for(int i=2; i<=n; i++) {
            cntStairs[i] = cntStairs[i-1] + cntStairs[i-2];
        }
        
        return cntStairs[n];
    }
}