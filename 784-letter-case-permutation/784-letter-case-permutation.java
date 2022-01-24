class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        generatePermutation(ans, 0, s.toCharArray());
        return ans;
    }
    
    public void generatePermutation(List<String> ans, int idx, char[] s) {
        if(idx == s.length)
            ans.add(new String(s));
        else {
            if(Character.isLetter(s[idx])) {
                s[idx]=Character.toUpperCase(s[idx]);
                generatePermutation(ans, idx+1, s);
                s[idx]=Character.toLowerCase(s[idx]);
                generatePermutation(ans, idx+1, s);
            } else
                generatePermutation(ans, idx+1, s);
        }
    }
}