class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for(String w : words) 
            if(matches(w, pattern))
                ans.add(w);
        
        return ans;
    }
    
    private boolean matches(String word, String patt) {
        char[] patternToWord = new char[26];
        char[] wordToPattern = new char[26];
        
        for(int i=0; i<patt.length(); i++) {
            char wordChar = word.charAt(i);
            char pattChar = patt.charAt(i);
            
            if(patternToWord[pattChar-'a'] == 0)
                patternToWord[pattChar-'a'] = wordChar;
            if(wordToPattern[wordChar-'a'] == 0)
                wordToPattern[wordChar-'a'] = pattChar;
            
            if(patternToWord[pattChar-'a'] != wordChar || wordToPattern[wordChar-'a'] != pattChar)
                return false;
        }
        return true;
    }
}