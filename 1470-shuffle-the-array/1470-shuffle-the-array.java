class Solution {
    public int[] shuffle(int[] nums, int n) {
        int maxNum = 1001;
        
        for(int i = 0; i < n; i++){
            nums[i+n] = maxNum * nums[i] + nums[i+n];
        }
        
        for(int i = 0; i < n; i++){
            nums[2*i] = nums[i+n] / maxNum;
            nums[2*i+1] = nums[i+n] % maxNum;
        }
        
        return nums;
    }
}