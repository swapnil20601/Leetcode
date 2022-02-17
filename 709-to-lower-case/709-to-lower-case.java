class Solution {
    public String toLowerCase(String s) {
        //USING HASHMAP
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder res = new StringBuilder();
        
        Map<Character, Character> map = new HashMap<>();
        
        for(int i = 0; i < 26; i++){
            map.put(upper.charAt(i), lower.charAt(i));
        }
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                res.append(map.get(c));
            }
            else{
                res.append(c);
            }
        }
        
        return res.toString();
    }
}

//try with hashmap

/*  
public String toLowerCase(String s) {
        char[] res = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
           
            res[i] = (res[i] >= 65 && res[i] <= 90) ? (char)(res[i] + 32) : res[i];
        }
        return new String(res);
    }

*/