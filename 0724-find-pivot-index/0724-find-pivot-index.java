class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, leftSum = 0, rightSum = 0;
        for(int val : nums) total += val;

        for(int i = 0 ; i < nums.length; i++){
            rightSum = total - nums[i] - leftSum;
            if(rightSum == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}