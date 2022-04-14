class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] = new int[nums.length];
        
        int[] freq = new int[101];
        
        //update frequency of each number in nums[] in freq[]
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        
        //calculate running sum
        for(int i = 1; i < freq.length; i++){
            freq[i] = freq[i] + freq[i-1];
        }
        
        //We will 1st look for nums[i] in freq[] & will pick prev index's value for freq[nums[i]] ONLY IF nums[i] != 0.
        //Otherwise we will simply put 0 if nums[i] = 0 bcoz 0 is the smallest of all as per given constraints. If we 
        // go for prev index val freq[nums[i]] , then we wiil get -1 & ArrayIndexOutOfBound
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                res[i] = 0;
            } else {
                res[i] = freq[nums[i] - 1];
            }
        }
        
        return res;
    }
}
