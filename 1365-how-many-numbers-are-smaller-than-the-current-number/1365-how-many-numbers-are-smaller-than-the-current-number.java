class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] freq = new int[101];
        
        //stor occurences of each number in nums insode freq array
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        
        //calculatr prefix sum till end of freq array
        for(int i = 1; i < 101; i++){
            freq[i] += freq[i-1];
        }
        
        //update res[] array ith the element just before nums[i]. Beware if nums[i] = 0. Take special care
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                res[i] = 0;
            }
            else {
                res[i] = freq[nums[i]-1];
            }
        }
        return res;
    }
}