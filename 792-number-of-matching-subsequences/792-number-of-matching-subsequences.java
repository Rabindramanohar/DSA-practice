class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, Queue<String>> hm = new HashMap<>();
        int ans = 0;
        
        for(int i=0; i<s.length(); i++)
            hm.putIfAbsent(s.charAt(i), new LinkedList<>());
        
        for(String word : words) {
            char startChar = word.charAt(0);
            if(hm.containsKey(startChar))
                hm.get(startChar).offer(word);
        }
        
        for(int i=0; i<s.length(); i++) {
            char startChar = s.charAt(i);
            Queue<String> q = hm.get(startChar);
            int size = q.size();
            for(int k=0; k<size; k++) {
                String str = q.poll();
                if(str.substring(1).length() == 0)
                    ans++;
                else
                    if(hm.containsKey(str.charAt(1)))
                        hm.get(str.charAt(1)).add(str.substring(1));
            }
        }
        return ans;
    }
}