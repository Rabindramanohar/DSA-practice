class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c != '#')
                st.push(c);
            else if(c == '#' && !st.isEmpty())
                st.pop();
        }
        return String.valueOf(st);
    }
}