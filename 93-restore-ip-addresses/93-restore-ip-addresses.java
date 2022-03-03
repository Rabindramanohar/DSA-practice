class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        helper(s, ans, 0, "");
        return ans;
    }
    
    private void helper(String s, List<String> ans, int n, String curr) {
        if(n == 4) {
            if(s.length() == 0)
                ans.add(curr.substring(0, curr.length()-1));
            return;
        }
        for(int i=1; i<=3; i++) {
            if(s.length() < i) continue;
            int val = Integer.parseInt(s.substring(0, i));
            // if(val > 255 || i != val+"".length())
            //     continue;
            if(val>255 || i!=String.valueOf(val).length()) continue;
            helper(s.substring(i), ans, n+1, curr+s.substring(0, i)+".");
        }
    }
}