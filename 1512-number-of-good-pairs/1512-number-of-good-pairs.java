class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num:nums){
            int val = map.getOrDefault(num, 0);
            count += val;
            map.put(num,val+1);
        }
        
        return count;
    }
}

//Next attempt try usinh 1: frequency array 2: HasTable
// IF you want video see for 3 apporach: https://www.youtube.com/watch?v=Qn_hJwwa-28&t=421s & 
//for hashtable see starting from time 8:56: https://www.youtube.com/watch?v=qvQSvQaY9KI
