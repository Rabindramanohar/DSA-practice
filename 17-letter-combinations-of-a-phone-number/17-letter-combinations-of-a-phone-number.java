class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0 || digits == null)
            return ans;
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        combination(digits, ans, mapping, "", 0);
        return ans;
    }
    
    private static void combination(String digits, List<String> ans, String[] mapping, String curr, int idx) {
        if(idx == digits.length()) {
            ans.add(curr);
            return;
        }
        
        String letters = mapping[digits.charAt(idx) - '0'];
        for(int i=0; i<letters.length(); i++) {
            combination(digits, ans, mapping, curr + letters.charAt(i), idx+1);
        }
    }
}