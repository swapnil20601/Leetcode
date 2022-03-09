class Solution {
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
}