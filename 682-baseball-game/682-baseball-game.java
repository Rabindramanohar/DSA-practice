class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for(String ele : ops) {
            if(ele.equals("+")) {
                int t = st.pop();
                int newT = t + st.peek();
                st.push(t);
                st.push(newT);
            } else if(ele.equals("C"))
                st.pop();
            else if(ele.equals("D")) {
                st.push(2*st.peek());
            } else
                st.push(Integer.valueOf(ele));
        }
        int ans = 0;
        for(int ele : st)
            ans += ele;
        
        return ans;
    }
}