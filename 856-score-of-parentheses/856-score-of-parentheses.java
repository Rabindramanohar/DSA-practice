class Solution {
    public int scoreOfParentheses(String s) {
        // count bal substring
        int ans=0, bal=0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(')
                bal++;
            else {
                bal--;
                if(s.charAt(i-1) == '(')
                    ans += 1<<bal;
            }
        }
        return ans;
    }
}