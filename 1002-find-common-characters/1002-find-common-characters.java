class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int[] common_freq = new int[26];
        
        //thill will fill common_freq[] with MAX_INTEGER
        Arrays.fill(common_freq, Integer.MAX_VALUE);
        
        for(String currWord : words){
            int[] freq = new int[26];
            
            for(char c : currWord.toCharArray()){
                freq[c - 'a']++;
            }
            
            for(int i = 0 ; i < 26; i++){
                common_freq[i] = Math.min(common_freq[i], freq[i]);
            }
        }
        
        for( int i = 0; i < 26; i++){
            while(common_freq[i] > 0){
                res.add(Character.toString(i+'a'));
                common_freq[i]--;
            }
        }
        
        return res;
    }
}