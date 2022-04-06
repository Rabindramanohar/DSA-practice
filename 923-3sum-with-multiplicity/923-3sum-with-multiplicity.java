class Solution {
    // brute force T=O(n*n)
    public int threeSumMulti(int[] arr, int target) {
        int MOD = (int)(1e9+7), n = arr.length;
        long ans = 0;
        for(int i=0; i<n; i++) {
            int[] cnt = new int[101];
            for(int j=i+1; j<n; j++) {
                int k = target-arr[i]-arr[j];
                if(k>=0 && k<=100 && cnt[k]>0) {
                    ans += cnt[k];
                    ans %= MOD;
                }
                cnt[arr[j]]++;
            }
        }
        return (int)ans;
    }
}