class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length == 0 || nums == null){
            return nums;
        }
        
        for(int i = 0 ; i < n; i++){
            nums[i+n] = nums[i]*1001+nums[i+n];
        }
        
        for(int i = 0; i < n; i++){
            nums[2*i] = nums[i+n] / 1001;
            nums[2*i+1] = nums[i+n] % 1001;
        }
        return nums;
    }
}