class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> map = new HashMap<>();
        int count = 0;
        
        for(String s: arr){
            if(map.containsKey(s)){
                map.put(s, false);
            }
            else {
                map.put(s, true);
            }
        }
        
        for(String s: arr){
            if(map.get(s)){
                count++;
                if(count == k){
                    return s;
                }
            }
        }
        
        return "";
    }
}