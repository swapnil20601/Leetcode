class Solution {
    /* Try more couple of exmaples
    1) arr[] = {1, 5, 3, 4, 2}, k = 3, output = 2
    2) arr[] = {8, 12, 16, 4, 0, 20}, k = 4, output = 5
    3) arr[] = {1, 3, 5, 8, 6, 4, 6}; k = 2, output = 6
    */
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;
        
        for(int ele: nums){
            if(map.containsKey(ele-k)){
                pairs += map.get(ele-k);
            }
            if(map.containsKey(ele+k)){
                pairs += map.get(ele+k);
            }
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        
        return pairs;
    }
}