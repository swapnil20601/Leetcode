class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            if(currSum >= 0){
                currSum += nums[i];
            }
            else{
                currSum = nums[i];
            }

            if(currSum > maxSum){
                maxSum = currSum;
            }
        }

        return maxSum;
    }
}