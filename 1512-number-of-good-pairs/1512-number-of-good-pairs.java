class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1;i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
}

//Next attempt try usinh 1: frequency array 2: HasTable
// IF you want video see for 3 apporach: https://www.youtube.com/watch?v=Qn_hJwwa-28&t=421s & 
//for hashtable see starting from time 8:56: https://www.youtube.com/watch?v=qvQSvQaY9KI
