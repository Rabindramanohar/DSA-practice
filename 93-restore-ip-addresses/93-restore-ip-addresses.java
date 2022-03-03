class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        helper(s, ans, 0, 0, "");
        return ans;
    }
    
    private void helper(String s, List<String> ans, int idx, int n, String curr) {
        if(idx == s.length() || n == 4) {
            if(idx == s.length() && n == 4) 
                ans.add(curr.substring(0, curr.length()-1));
            return;
        }
        
        helper(s, ans, idx+1, n+1, curr+s.charAt(idx)+".");
        if(idx+2 <= s.length() && isValid(s.substring(idx, idx+2)))
            helper(s, ans, idx+2, n+1, curr+s.substring(idx, idx+2)+".");
        if(idx+3 <= s.length() && isValid(s.substring(idx, idx+3)))
            helper(s, ans, idx+3, n+1, curr+s.substring(idx, idx+3)+".");
    }
    
    private boolean isValid(String str) {
        if(str.charAt(0) == '0')
            return false;
        
        return Integer.parseInt(str) <= 255;
    }
}