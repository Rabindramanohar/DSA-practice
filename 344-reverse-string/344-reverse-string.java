class Solution {
    public void reverseString(char[] s) {
        
        reverseStringFunc(0, s.length-1, s);
    }
    
    public void reverseStringFunc(int l, int r, char[] s) {
        if(l>=r)
            return;
        
        // swap
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp; 
        
        reverseStringFunc(l+1, r-1, s);
    }
}