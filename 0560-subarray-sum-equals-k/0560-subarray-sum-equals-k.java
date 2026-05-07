class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;
        for(int val : nums){
            prefixSum += val;
            int key = prefixSum - k;
            if(map.containsKey(key)){
                result += map.get(key);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return result;
    }
}