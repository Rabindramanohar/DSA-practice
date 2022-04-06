class Solution {
    // with formula T = O(n+100*100)
    public int threeSumMulti(int[] arr, int target) {
        int MOD = (int)(1e9+7);
        long ans = 0;
        long[] cnt = new long[101];
        for(int i: arr)
            cnt[i]++;
        
        for(int i=0; i<=100; i++) {
            for(int j=i; j<=100; j++) {
                int k=target-i-j;
                if(k<0 || k>100) continue;
                if(i == j && j == k)
                    ans += (cnt[i]*(cnt[i]-1)*(cnt[i]-2)/6);
                else if(i == j && j != k)
                    ans += ((cnt[i]*(cnt[i]-1)/2)*cnt[k]);
                else if(i<j && j<k)
                    ans += cnt[i]*cnt[j]*cnt[k];
            }
        }
        return (int)(ans%MOD);
    }
}