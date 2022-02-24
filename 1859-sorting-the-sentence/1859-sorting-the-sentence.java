class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        
        for(String word: words){
            char ch = word.charAt(word.length()-1);
            
            int index = Character.getNumericValue(ch) - 1;;
            res[index] = word.substring(0,word.length()-1);
        }
        
        for(int i = 0; i < res.length-1;i++){
            sb.append(res[i]).append(" ");
        }
        
        sb.append(res[res.length-1]);
        
        return sb.toString();
    }
}