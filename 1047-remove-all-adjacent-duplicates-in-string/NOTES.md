**Appraoch 1: Using Stack
TC = O(N)
SC = O(N)**
​
​
public String removeDuplicates(String s) {
Deque<Character> stk = new ArrayDeque<>();
StringBuilder sb = new StringBuilder();
for(char c: s.toCharArray()){
if(!stk.isEmpty() && stk.peek() == c) {
stk.pop();
} else {
stk.push(c);
}
}
while(!stk.isEmpty()){
sb.append(stk.pop());
}
return sb.reverse().toString();
}
=------------------------------------------------------------
**Appraoch 2: Using StringBuilder
TC = O(N)
SC = O(N)**