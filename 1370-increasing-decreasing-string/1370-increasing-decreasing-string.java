class Solution {
    public String sortString(String s) {
        StringBuilder res = new StringBuilder();
        int[] bucket = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            bucket[s.charAt(i) - 97]++;
        }
        
        while(res.length() < s.length()){
            for(int i = 0; i < 26; i++){
                if(bucket[i]-- > 0){
                    res.append((char)(97+i));
                }
            }
            
            for(int i = 25; i >= 0; i--){
                if(bucket[i]-- > 0){
                    res.append((char)(97+i));
                }
            }
        }
        
        return new String(res);//OR res.toString(); OR String.valueOf(res)
    }
}