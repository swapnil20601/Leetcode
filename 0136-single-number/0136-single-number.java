class Solution {
    public int singleNumber(int[] nums) {

        /* 
        Better Soln: Using HashMAp => TC: O(N*logM) + O(M) & SC: O(M) where M is size of hashmap
        
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
        
        
        
        */

        //Optimal: Using XOR: TC = O(N)
        int xor = 0;
        for(int ele : nums){
            xor ^= ele;
        }
        return xor;
    }
}