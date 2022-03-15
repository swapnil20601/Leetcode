class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int key : nums1){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        
        for(int val : nums2){
            if(map.containsKey(val) && map.get(val) > 0){
                int count = map.get(val);
                list.add(val);
                map.put(val, count-1);
            }
        }
        
        int[] res = new int[list.size()];
        
        for(int i = 0;i < res.length; i++){
            res[i] = list.get(i);
        }
        
        return res;
    }
}