class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> map = new LinkedHashMap<>();
        int count = 0;
        
        for (String s: arr) {
            map.put(s, !map.containsKey(s));
        }
        
        for(String key: map.keySet()){
            if(map.get(key)){
                count++;
                if(count == k){
                    return key;
                }
            }
        }
        
        return "";
    }
}