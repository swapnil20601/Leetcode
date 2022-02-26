class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i = 0; i < 26; i++){
            char letter = (char)(i+97);
            if(sentence.indexOf(letter) < 0){
                return false;
            }
        }
        return true;
    }
}