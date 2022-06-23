class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int c = 0;
        
        for(int i : nums){
            c = c + freq[i]++;
        }
        return c;
    }
}

//Next attempt try usinh 1: frequency array 2: HasTable
// IF you want video see for 3 apporach: https://www.youtube.com/watch?v=Qn_hJwwa-28&t=421s & 
//for hashtable see starting from time 8:56: https://www.youtube.com/watch?v=qvQSvQaY9KI
