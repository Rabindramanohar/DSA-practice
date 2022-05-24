class Solution {
    // no extra space
    public int longestValidParentheses(String s) {
        int l=0, r=0, len=0, n=s.length();
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '(')
                l++;
            else
                r++;
            if(l == r)
                len = Math.max(len, 2*r);
            else if(r >= l)
                l=r=0;
        }
        l=r=0;
        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == '(')
                l++;
            else
                r++;
            if(l == r)
                len = Math.max(len, 2*l);
            else if(l >= r)
                l=r=0;
        }
        return len;
    }
}