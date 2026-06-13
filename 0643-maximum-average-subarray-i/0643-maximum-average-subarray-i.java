class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int i = 0, j = 0;
        int currSum = 0;
        while(j < n){
            currSum += nums[j];
            if(j-i+1 == k){
                ans = Math.max(ans,currSum);
                currSum -= nums[i];
                i++;
            }
            j++;
        }

        return (double)ans/k;
    }
}