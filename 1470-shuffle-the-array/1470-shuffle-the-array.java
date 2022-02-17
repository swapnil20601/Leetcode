class Solution {
    public int[] shuffle(int[] nums, int n) {
        int maxVal = 1001;
        
        for(int i= 0; i < n; i++){
            nums[i+n] = nums[i] * maxVal + nums[i+n];
        }
        
        for(int i= 0; i < n; i++){
            nums[2*i] = nums[i+n] / maxVal;
            nums[2*i + 1] = nums[i+n] % maxVal;
        }
        
        return nums;
    }
}