class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
        int n = envelopes.length;
        int[] dp = new int[n];
        int len = 0;
        for(int i=0; i<n; i++) {
            int idx = binarySearch(dp, 0, len, envelopes[i][1]);
            dp[idx] = envelopes[i][1];
            if(idx == len) len++;
        }
        return len;
    }
    
    private int binarySearch(int[] arr, int l, int h, int k) {
        // while(l < h) {
        //     int mid = l + (h-l)/2;
        //     if(arr[mid] == k)
        //         return mid;
        //     else if(arr[mid] > k)
        //         h=mid;
        //     else
        //         l=mid+1;
        // }
        // return l;
        int idx = Arrays.binarySearch(arr, l, h, k);
        if(idx < 0)
            idx = -(idx+1);
        return idx;
    }
}