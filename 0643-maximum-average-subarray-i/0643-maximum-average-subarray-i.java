class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0,  j = 0;
        int currSum = 0;
        int maxAverage = Integer.MIN_VALUE;

        while(j < nums.length){
            currSum += nums[j];

            if(j-i+1 == k){
                maxAverage = Math.max(maxAverage, currSum);
                currSum -= nums[i];
                i++;
            }

            j++;
        }
        return (double)maxAverage/k;
    }
}