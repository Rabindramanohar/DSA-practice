class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int ns = s.length();
        int np = p.length();
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        
        for(int i=0; i<np; i++) {
            char c = p.charAt(i);
            pArr[c - 'a']++;
        }
        
        for(int i=0; i<ns; i++) {
            sArr[ s.charAt(i)-'a']++;
            
            if(i >= np) {
                char c = s.charAt(i-np);
                sArr[c-'a']--;
            }
            
            if(Arrays.equals(pArr, sArr)) 
                ans.add(i-np+1);
        }
        return ans;
    }
}