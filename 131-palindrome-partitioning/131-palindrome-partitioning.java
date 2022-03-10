class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s, ans, 0, new ArrayList<>());
        return ans;
    }
    
    private void helper(String s, List<List<String>> ans, int idx, List<String> curr) {
        if(idx == s.length()) {
            ans.add(new ArrayList<String>(curr));
            return;
        }
        
        for(int i=idx; i<s.length(); i++) {
            if(isPalindrom(idx, i, s)) {
                curr.add(s.substring(idx, i+1));
                helper(s, ans, i+1, curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    
    private boolean isPalindrom(int i, int j, String s) {
        while(i<=j) {
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}