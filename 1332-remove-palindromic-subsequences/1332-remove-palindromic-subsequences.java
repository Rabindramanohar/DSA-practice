class Solution {
    public int removePalindromeSub(String s) {
        if(s.length() == 0) return 0;
        if(isPalindrom(s))
            return 1;
        return 2;
    }
    private boolean isPalindrom(String str) {
        int l=0, h=str.length()-1;
        while(l<=h) {
            if(str.charAt(l) != str.charAt(h))
                return false;
            l++; h--;
        }
        return true;
    }
}