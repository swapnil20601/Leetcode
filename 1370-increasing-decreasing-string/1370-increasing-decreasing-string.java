class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        while(res.length() < s.length()){
            for(int i = 0; i < 26; i++){
                if(freq[i] > 0){
                    res.append((char)(i+97));
                }
                freq[i]--;
            }
            
            for(int i = 25; i >= 0; i--){
                if(freq[i] > 0){
                    res.append((char)(i+97));
                }
                freq[i]--;
            }
        }
        
        return res.toString();
    }
}