class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int ones = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                ones++;
            }
            else{
                maxi = Math.max(maxi,ones);
                ones = 0; 
            }
        }
        return Math.max(maxi,ones);
    }
}