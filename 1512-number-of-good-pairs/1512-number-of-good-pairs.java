class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] res = new int[101];
        int pairs = 0;
        
        for(int i = 0; i < nums.length; i++){
            pairs = pairs + res[nums[i]]++;
        }
        
        return pairs;
    }
}

//Next attempt try usinh 1: frequency array 2: HasTable
// IF you want video see for 3 apporach: https://www.youtube.com/watch?v=Qn_hJwwa-28&t=421s & 
//for hashtable see starting from time 8:56: https://www.youtube.com/watch?v=qvQSvQaY9KI
