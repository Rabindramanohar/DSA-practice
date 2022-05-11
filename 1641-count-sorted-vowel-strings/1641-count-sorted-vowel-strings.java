class Solution {
    // recursive T = O(5^n)
    char[] ch = new char[]{'a', 'e', 'i', 'o', 'u'};
    public int countVowelStrings(int n) {
        int ans = 0;
        for(char c : ch)
            ans += helper(n-1, c);
        return ans;
    }
    
    private int helper(int n, char lCh) {
        // base case
        if(n == 0)
            return 1;
        int tmp = 0;
        for(char c : ch)
            if(lCh >= c)
                tmp += helper(n-1, c);
        return tmp;
    }
}