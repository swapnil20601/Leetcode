class Solution {
    public int firstUniqChar(String s) {
        boolean isRepeating;
        
        if(s.length() == 0 || s == null){
            return -1;
        }
        
        for(int i = 0; i < s.length(); i++){
            isRepeating = false;
            for(int j = 0; j < s.length(); j++){
                if(i !=j && s.charAt(i) == s.charAt(j)){
                    isRepeating = true;
                    break;
                }
            }
            
            if(!isRepeating){
                return i;
            }
        }
        
        return -1;
    }
}