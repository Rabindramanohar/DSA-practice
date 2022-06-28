class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++)
            freq[s.charAt(i)-'a']++;
        int cnt=0;
        Set<Integer> hs = new HashSet<>();
        for(int i=0; i<26; i++) {
            while(freq[i] > 0 && hs.contains(freq[i])) {
                freq[i]--;
                cnt++;
            }
            hs.add(freq[i]);
        }
        return cnt;
    }
}