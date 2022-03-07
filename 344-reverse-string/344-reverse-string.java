class Solution {
    public void reverseString(char[] s) {
        helper(s, 0 , s.length-1);
    }
    
    private void helper(char[] s, int start, int end){
        if(start >= end){
            return;
        }
        
        char c = s[start];
        s[start++] = s[end];
        s[end--] = c;
        
        helper(s, start, end);
    }
}