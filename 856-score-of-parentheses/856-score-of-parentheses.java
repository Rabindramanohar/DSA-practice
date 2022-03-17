class Solution {
    public int scoreOfParentheses(String s) {
        // stack way
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char c : s.toCharArray()) {
            if(c == '(')
                st.push(0);
            else {
                int p = st.pop();
                int q = st.pop();
                st.push(q + Math.max(2*p, 1));
            }
        }
        return st.pop();
    }
}