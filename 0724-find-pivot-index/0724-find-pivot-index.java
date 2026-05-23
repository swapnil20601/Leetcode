class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int leftSum = 0, rightSum = 0;
            for(int j = i-1; j>=0; j--){
                leftSum += nums[j];
            }
            for(int k = i+1; k < n; k++){
                rightSum += nums[k];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}