class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int key : arr){
            map.put(key, map.getOrDefault(key,0)+1);
        }
        
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}