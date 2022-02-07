class Solution {
    public char findTheDifference(String s, String t) {
        int cntChar = t.charAt(s.length());
        for(int i=0; i<s.length(); i++) {
            cntChar -= (int)s.charAt(i);
            cntChar += (int)t.charAt(i);
        }
        return (char)cntChar;
    }
}