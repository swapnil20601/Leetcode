class Solution {
    public String toLowerCase(String s) {
        String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        
        Map<Character, Character> map = new HashMap<>();
        for(int i= 0; i < caps.length();i++){
            map.put(caps.charAt(i), lower.charAt(i));
        }
        
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                sb.append(map.get(c));
            }
            else{
                sb.append(c);
            }
        }
        
        return new String(sb);
    }
}

