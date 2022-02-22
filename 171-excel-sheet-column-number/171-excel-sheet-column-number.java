class Solution {
    public int titleToNumber(String col) {
        int ans = 0, factor = 1;
        for(int i=col.length()-1; i>=0; i--) {
            ans += factor*(col.charAt(i)-'A'+1);
            factor *= 26;
        }
        return ans;
    }
}