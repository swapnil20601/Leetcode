class Solution {
    public boolean checkIfPangram(String sentence) {
       for(int i = 0;i < 26; i++){
           char alphabet = (char)(i+'a');
           if(sentence.indexOf(alphabet) < 0){
               return false;
           }
       }
        
        return true;
    }
}