class Solution {
    public String convertToTitle(int n) {
        String ans = "";
        while(n>0) {
            n--;
            ans = (char)((n%26)+'A') + ans;
            n /= 26;
        }
        return ans;
    }
}