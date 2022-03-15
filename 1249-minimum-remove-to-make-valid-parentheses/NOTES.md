**algo**
* Store all the '(' indexs in stack;
* loop over the string;
* If we encounter with ')' and stack is not empty pop recent '(' index from stack;
* If stack is empty and encounter with ')' change it to '';
* and if encounter with '(' push it's index value to stack;
* In 2nd parse if stack is not empty, then make all the '(' index places to '';
* append all the character to StringBuilder if not equal to '*';
​
```java
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
```