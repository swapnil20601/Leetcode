class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length == 0 || nums == null){
            return nums;
        }
        
        int[] res = new int[2*n];
        int j = 0;
        
        for(int i = 0; i< n; i++){
            res[j++] = nums[i];
            res[j++] = nums[i+n];
        }
        return res;
    }
}