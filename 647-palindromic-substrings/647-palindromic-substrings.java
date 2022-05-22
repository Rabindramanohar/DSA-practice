class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), cnt=0;
        if(n==0) return 0;
        char[] c = s.toCharArray();
        for(int i=0; i<n; i++) {
            cnt += cntPalindrom(i, i, c);
            cnt += cntPalindrom(i, i+1, c);
        }
        return cnt;
    }
    private int cntPalindrom(int i, int j, char[] c) {
        int cnt = 0;
        while(i>=0 && j<c.length && c[i--] == c[j++])
            cnt++;
        return cnt;
    }
}