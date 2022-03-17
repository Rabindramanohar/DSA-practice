class Solution {
    public int scoreOfParentheses(String s) {
        return helper(s, 0, s.length());
    }
    
    public int helper(String s, int i, int j) {
        int bal=0, ans=0;
        
        for(int k=i; k<j; k++) {
            bal += s.charAt(k) == '(' ? 1 : -1;
            if(bal == 0) {
                if(k-i == 1)
                    ans++;
                else 
                    ans += 2*helper(s, i+1, k);
                i = k+1;
            }
        }
        return ans;
    }
}