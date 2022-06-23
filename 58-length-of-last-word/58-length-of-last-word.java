class Solution {
    public int lengthOfLastWord(String s) {       
        if(s.length() < 1) return 0;
        
        s = s.trim();
        
        return s.length() - s.lastIndexOf(' ') -1;
        
    }
}