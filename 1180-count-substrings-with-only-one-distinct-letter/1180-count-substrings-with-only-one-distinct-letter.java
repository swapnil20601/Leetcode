class Solution {
    public int countLetters(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        
        int count = 1;
        int[] substring = new int[s.length()];
        substring[0] = 1;
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                substring[i] = substring[i-1] + 1;
            }
            else {
                substring[i] = 1;
            }
            count += substring[i];
        }
        return count;
    }
}