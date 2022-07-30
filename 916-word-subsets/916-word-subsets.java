class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] target = new int[26];
        
        for(String b : words2) {
            int[] tmp = new int[26];
            for(char c : b.toCharArray()){
                tmp[c-'a']++;
                target[c-'a'] = Math.max(target[c-'a'], tmp[c-'a']);
            }
        }
        
        for(String a : words1) {
            int[] tmp = new int[26];
            for(char c : a.toCharArray())
                tmp[c-'a']++;
            if(subset(tmp, target))
                ans.add(a);
        }
        return ans;
    }
    
    private boolean subset(int[] source, int[] dest) {
        for(int i=0; i<26; i++) {
            if(dest[i] > source[i])
                return false;
        }
        return true;
    }
}