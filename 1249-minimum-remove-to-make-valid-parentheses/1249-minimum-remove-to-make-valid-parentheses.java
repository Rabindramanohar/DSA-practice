class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<sb.length(); i++) {
            char c = sb.charAt(i);
            if(c == '(')
                st.push(i);
            if(c == ')') {
                if(!st.isEmpty())
                    st.pop();
                else
                    sb.setCharAt(i, '*');
            }
        }
        
        while(!st.isEmpty())
            sb.setCharAt(st.pop(), '*');
        
        return sb.toString().replaceAll("\\*", ""); 
    }
}