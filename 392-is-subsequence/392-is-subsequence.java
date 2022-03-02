class Solution {
    public boolean isSubsequence(String s, String t) {
        int i1=0, i2=0;
        while(i1 < s.length()) {
            if(i2 >= t.length())
                return false;
            if(s.charAt(i1) == t.charAt(i2)) {
                i1++;
                i2++;
            } else 
                i2++;
        }
        return true;
    }
}