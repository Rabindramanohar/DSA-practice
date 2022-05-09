class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] map = {"0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"};
        if(digits.length() == 0) return ans;
        combinations(digits, ans, map, "", 0);
        return ans;
    }
    private void combinations(String digits, List<String> ans, String[] map, String curr, int idx) {
        // base case
        if(idx == digits.length()) {
            ans.add(curr);
            return;
        }
        
        String letter = map[digits.charAt(idx)-'0'];
        for(int i=0; i<letter.length(); i++)
            combinations(digits, ans, map, curr+letter.charAt(i), idx+1);
    }
}