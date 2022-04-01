class Solution {
    public void reverseString(char[] s) {
        helper(0, s.length-1, s);
    }
    private void helper(int l, int r, char[] s) {
        // base case:
        if(l >= r) return;
        
        //swap
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;
        
        helper(l+1, r-1, s);
    }
}