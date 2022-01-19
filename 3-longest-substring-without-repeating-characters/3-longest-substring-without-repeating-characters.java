class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, len = 0;
        int n = s.length();
        Map<Character, Integer> hm = new HashMap<>();
        while(right < n) {
            if(hm.containsKey(s.charAt(right)))
                left = Math.max(left, hm.get(s.charAt(right))+1);
            hm.put(s.charAt(right), right);
            len = Math.max(len, right-left + 1);
            right++;
        }
        return len;
    }
}