class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] res = new boolean[26];
        
        for(char c : sentence.toCharArray()){
            res[c-'a'] = true;
        }
        
        for(boolean flag:res){
            if(!flag){
                return false;
            }
        }
        
        return true;
    }
}