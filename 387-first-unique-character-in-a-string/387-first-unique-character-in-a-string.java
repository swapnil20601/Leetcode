class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length() == 0 || s == null){
            return -1;
        }
        
        int[] freq = new int[26];
        
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(freq[index] < 2){
                return i;
            }
        }
        
        return -1;
    }
}