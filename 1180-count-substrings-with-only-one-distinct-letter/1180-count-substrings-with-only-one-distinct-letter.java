class Solution {

    public int countLetters(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        
        int total = 1;
        int count = 1;
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else {
                count = 1;
            }
            
            total += count;
        }
        
        return total;
    }
}