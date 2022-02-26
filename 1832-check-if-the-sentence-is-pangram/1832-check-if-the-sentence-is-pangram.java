class Solution {
    public boolean checkIfPangram(String sentence) {
         boolean[] alphabets = new boolean[26];
        
        for(char c : sentence.toCharArray()){
            alphabets[c - 97] = true;
        }
        
        for(boolean letter: alphabets){
            if(!letter){
                return false;
            }
        }
        
        return true;
    }
}