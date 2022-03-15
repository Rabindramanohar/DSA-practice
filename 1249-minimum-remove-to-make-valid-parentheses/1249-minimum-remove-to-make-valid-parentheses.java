class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++) {
            char c = sb.charAt(i);
            if(!st.isEmpty() && c == ')')
                st.pop();
            else if(st.isEmpty() && c == ')')
                sb.setCharAt(i, '*');
            
            if(c == '(')
                st.push(i);
        }
        
        if(!st.isEmpty()) {
            while(st.size() > 0) {
                int idx = st.pop();
                sb.setCharAt(idx, '*');
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<sb.length(); i++) {
            char c = sb.charAt(i);
            if(c != '*')
                ans.append(c);
        }
        
        return ans.toString();
    }
}