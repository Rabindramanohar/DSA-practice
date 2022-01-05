class Solution {
    public List<List<String>> partition(String str) {
        List<List<String>> ans = new ArrayList<>();
        List<String> step = new ArrayList<>();
        helper(str, 0, step, ans);
        return ans;
    }
    
    public void helper(String str, int idx, List<String> step, List<List<String>> ans) {
        //base case
        if(idx == str.length()) {
            ans.add(new ArrayList<>(step));
            return;
        }
        
        // recursion logic
        for(int i=idx; i<str.length(); i++) {
            if(isPalindrom(str, idx, i)) {
                step.add(str.substring(idx, i+1));
                helper(str, i+1, step, ans);
                step.remove(step.size()-1);
            }
        }
    }
    
    public boolean isPalindrom(String str, int start, int end) {
        while(start <= end) {
            if(str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }
}