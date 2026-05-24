class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        
        for(Integer ele : nums){
            map2.put(ele, map2.getOrDefault(ele,0)+1);
        }

        for(int i = 0; i < n; i++){
            int element = nums.get(i);
            map1.put(element, map1.getOrDefault(element,0)+1);
            map2.put(element, map2.get(element)-1);
            
            int freq1 = map1.get(element);
            int n1 = i+1;

            int freq2 = map2.get(element);
            int n2 = n-i-1;

            if(freq1 > n1/2 && freq2 > n2/2){
                return i;
            }
        }

        return -1;
    }
}