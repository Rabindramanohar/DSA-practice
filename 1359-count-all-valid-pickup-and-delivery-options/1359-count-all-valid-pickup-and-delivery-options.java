class Solution {
    public int countOrders(int n) {
        long ans = 1;
        int MOD = 1000000007;
        for(int i=1; i<=n; i++) {
            ans *= i;
            ans = ans*(2*i-1);
            ans %= MOD;
        }
        return (int)ans;
    }
}