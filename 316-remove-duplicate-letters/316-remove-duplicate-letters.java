class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIdx = new int[26];
        int n = s.length();
        for(int i=0; i<n; i++)
            lastIdx[s.charAt(i)-'a'] = i;
        boolean[] vis = new boolean[26];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++) {
            int c = s.charAt(i)-'a';
            if(vis[c])
                continue;
            while(!st.isEmpty() && st.peek() > c && i < lastIdx[st.peek()])
                vis[st.pop()] = false;
            st.push(c);
            vis[c] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append((char)(st.pop()+'a'));
        
        return sb.reverse().toString();
    }
}