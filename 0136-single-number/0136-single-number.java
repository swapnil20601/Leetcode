class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            int val = map.getOrDefault(x,0) + 1;
            map.put(x,val);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val == 1){
                return key;
            }
        }
        return -1;
    }
}