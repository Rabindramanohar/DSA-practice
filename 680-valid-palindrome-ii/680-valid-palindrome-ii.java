class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, h = s.length()-1;
        while(l < h) {
            if(s.charAt(l) != s.charAt(h))
                return isPalindrom(s, l, h-1) || isPalindrom(s, l+1, h);
            l++;
            h--;
        }
        return true;
    }
    private boolean isPalindrom(String s, int i, int j) {
        while(i < j)
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }
}