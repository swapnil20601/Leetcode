class Solution {
    public String sortString(String s) {
        StringBuilder res = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        while(map.size() > 0){
            //moving in forward direction
            for(int i = 0; i < 26; i++){
                char ch = (char)(i+97);
                if(map.containsKey(ch)){
                    res.append(ch);
                    map.put(ch, map.get(ch) - 1);
                    
                    if(map.get(ch) == 0){
                    map.remove(ch);
                    }
                }
            }
            
            //moving in backward direction
            for(int i = 25; i >= 0; i--){
                char ch = (char)(i+97);
                if(map.containsKey(ch)){
                    res.append(ch);
                    map.put(ch, map.get(ch) - 1);
                    
                    if(map.get(ch) == 0){
                    map.remove(ch);
                    }
                }
            }
        }
        
        return String.valueOf(res);
    }
}