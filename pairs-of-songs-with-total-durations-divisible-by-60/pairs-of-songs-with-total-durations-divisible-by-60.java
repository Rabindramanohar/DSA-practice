class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ar[] = new int[60];
        int cnt = 0;
        for(int i=0; i<time.length; i++) {
            ar[time[i]%60]++;
        }
        
        for(int i=0; i<=30; i++) {
            if(i==30 || i==0) {
                int n = ar[i];
                cnt += (n*(n-1))/2;
            } else {
                cnt += ar[i]*ar[60-i];
            }
        }
        return cnt;
    }
}