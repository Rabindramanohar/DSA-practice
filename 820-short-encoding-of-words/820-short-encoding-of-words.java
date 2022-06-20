class Solution {
    public int minimumLengthEncoding(String[] words) {
        // using sorting prefix
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        
        for(String s : words) {
            for(int i=1; i<s.length(); i++) {
                wordSet.remove(s.substring(i));
            }
        }
        int len=0;
        for(String s : wordSet) {
            len += s.length()+1;
        }
        return len;
    }
}