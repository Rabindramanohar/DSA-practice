class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for(int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                str += s.charAt(i);
        }
        
        return reverse(0, str.toCharArray());
    }
    public boolean reverse(int i, char[] c) {
        if(c.length == 1) return true;
        int n = c.length;
        if(i >= n)
            return true;
        if(c[i] != c[n-i-1])
            return false;
        
        return reverse(i+ 1, c);
    }
}