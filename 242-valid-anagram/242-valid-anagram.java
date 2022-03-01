class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() != t.length()){
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(int i = 0; i < t.length(); i++){
            char key = t.charAt(i);
            if(!map.containsKey(key)){
                return false;
            }
            else if(map.get(key) == 1){
                map.remove(key);
            }
            else{
                map.put(t.charAt(i), map.get(key)-1);
            }
        }

        return map.size() == 0;
    }
}